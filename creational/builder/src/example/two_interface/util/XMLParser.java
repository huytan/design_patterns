package example.two_interface.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import example.two_interface.Order;

public class XMLParser {
	private static double total;
	private DocumentBuilderFactory dbf;
	private static DocumentBuilder db;
	private static File file;
	public static XMLParser parser;
	private Order order = null;

	private XMLParser() {
		order = new Order();

		dbf = DocumentBuilderFactory.newInstance();
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static XMLParser getInstance(String fileName)
			throws ParserConfigurationException {
		if (parser == null) {
			parser = new XMLParser();
			file = new File(fileName);
		}
		return parser;
	}

	public Order getAllOrder() {
		if (file.exists()) {
			try {

				Document doc = db.parse(file);
				doc.getDocumentElement().normalize();

				// NodeList nodes = doc.getElementsByTagName("Order");
				NodeList nodeItems = doc.getElementsByTagName("Item");
				for (int i = 0; i < nodeItems.getLength(); i++) {
					Node node = nodeItems.item(i);
					if (node.getNodeType() == Node.ELEMENT_NODE) {

						Element element = (Element) node;
						order.setItems(getValue("ID", element));
						total += Double.parseDouble(getValue("ID", element));
						order.setItems(getValue("Qty", element));
					}
				}
				NodeList nodeShip = doc.getElementsByTagName("ShippingAddress");
				for (int i = 0; i < nodeShip.getLength(); i++) {
					Node node = nodeShip.item(i);
					if (node.getNodeType() == Node.ELEMENT_NODE) {

						Element element = (Element) node;
						order.setItems(getValue("Address1", element));
						order.setItems(getValue("Address2", element));
						order.setItems(getValue("City", element));
						order.setItems(getValue("State", element));
						order.setItems(getValue("Zip", element));
					}
				}

				NodeList nodeBill = doc.getElementsByTagName("BillingAddress");
				for (int i = 0; i < nodeBill.getLength(); i++) {
					Node node = nodeBill.item(i);
					if (node.getNodeType() == Node.ELEMENT_NODE) {

						Element element = (Element) node;
						order.setItems(getValue("Address1", element));
						order.setItems(getValue("Address2", element));
						order.setItems(getValue("City", element));
						order.setItems(getValue("State", element));
						order.setItems(getValue("Zip", element));
					}
				}
				String total2 = new Double(getTotal()).toString();
				order.setItems(total2);

			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return order;
	}

	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0)
				.getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}

	public static double getTotal() {
		return total;
	}

}
