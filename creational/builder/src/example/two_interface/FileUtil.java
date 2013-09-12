package example.two_interface;

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
	@SuppressWarnings("unchecked")
	public Vector readFileXML(String file) {
		Vector orderList = new Vector();
		try {
			File xmlFile = new File(file);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			NodeList nList = null;
			nList = doc.getElementsByTagName("Item");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					orderList.addElement(eElement.getElementsByTagName("ID")
							.item(0).getTextContent());
					orderList.addElement(eElement.getElementsByTagName("Qty")
							.item(0).getTextContent());
				}
			}
			nList = doc.getElementsByTagName("ShippingAddress");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					orderList.addElement(eElement
							.getElementsByTagName("Address1").item(0)
							.getTextContent());
					orderList.addElement(eElement
							.getElementsByTagName("Address2").item(0)
							.getTextContent());
					orderList.addElement(eElement.getElementsByTagName("City")
							.item(0).getTextContent());
					orderList.addElement(eElement.getElementsByTagName("State")
							.item(0).getTextContent());
					orderList.addElement(eElement.getElementsByTagName("Zip")
							.item(0).getTextContent());
				}
			}

			nList = doc.getElementsByTagName("BillingAddress");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					orderList.addElement(eElement
							.getElementsByTagName("Address1").item(0)
							.getTextContent());
					orderList.addElement(eElement
							.getElementsByTagName("Address2").item(0)
							.getTextContent());
					orderList.addElement(eElement.getElementsByTagName("City")
							.item(0).getTextContent());
					orderList.addElement(eElement.getElementsByTagName("State")
							.item(0).getTextContent());
					orderList.addElement(eElement.getElementsByTagName("Zip")
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
