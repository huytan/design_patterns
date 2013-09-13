package example.two_interface.builder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import example.two_interface.Order;

public class SaxHandler extends DefaultHandler {
	public static ArrayList<MyElement> listElement = new ArrayList<MyElement>();
	public static ArrayList<Order> listOrder = new ArrayList<Order>();

	public void pasreXML(String XMLData) {
		// FileUtil util = new FileUtil();
		// result = util.readFileXML(XMLData);
		// System.out.println(rerult);
		// tao SAX Factory
		SAXParserFactory spf = SAXParserFactory.newInstance();
		// validate file XML
		spf.setValidating(false);

		try {
			SAXParser saxParser = spf.newSAXParser();
			// tao xml reader
			XMLReader reader = saxParser.getXMLReader();
			FileReader file = new FileReader(XMLData);
			// gắn handle của lớp hiện hành vào
			reader.setContentHandler(new SaxHandler());

			// đọc XML
			reader.parse(new InputSource(file));

			// Sau khi đọc file XML chúng ta sẽ có listElement cùng với
			// giá trị
			// Sau đó chúng ta sẽ lọc listElement tạo ra các object Sach

			Order order = new Order();
			Vector items = new Vector();
			for (MyElement e : listElement) {
				// nếu là element sach thi tạo object Sach mới
				if (e.getqName().equalsIgnoreCase("LineItems"))
					order = new Order();
				if (e.getqName().equalsIgnoreCase("Item"))
					items = new Vector();

				else if (e.getqName().equalsIgnoreCase("ID"))
					items.add(e.getValue());

				else if (e.getqName().equalsIgnoreCase("Qty")) {
					items.add(e.getValue());
					order.setItems(items);
					listOrder.add(order);
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		MyElement e = new MyElement(uri, localName, qName, attributes);
		listElement.add(e);
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String s = new String(ch, start, length);
		s.trim();
		if (s.startsWith("\n") || s.startsWith("\t"))
			return;
		listElement.get(listElement.size() - 1).setValue(s);
	}
}
