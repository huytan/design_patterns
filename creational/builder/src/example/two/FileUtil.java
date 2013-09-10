package example.two;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class FileUtil {
	public Vector readFileXML(String file) {
		Vector orderList = new Vector();
		try {
			File xmlFile = new File(file);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			// System.out.println("Root element : "
			// + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("Item");
			// System.out.println("-------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				//
				// System.out
				// .println("\nCurrent Element : " + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// System.out.println("Author : "
					// + eElement.getElementsByTagName("ID").item(0)
					// .getTextContent());
					// System.out.println("Qty : "
					// + eElement.getElementsByTagName("Qty").item(0)
					// .getTextContent());
					orderList.addElement(eElement.getElementsByTagName("ID")
							.item(0).getTextContent());
					orderList.addElement(eElement.getElementsByTagName("Qty")
							.item(0).getTextContent());
				}
			}
			return orderList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
