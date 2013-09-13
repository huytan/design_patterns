package example.two_interface.builder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import example.two_interface.FileUtil;
import example.two_interface.Order;

public class OrderDirector extends DefaultHandler {
	OrderBuilder builder;

	public OrderDirector(OrderBuilder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}

	public OrderDirector() {
		// TODO Auto-generated constructor stub
	}

	public void pasre(String XMLData) {
		// FileUtil util = new FileUtil();
		// result = util.readFileXML(XMLData);
		// System.out.println(rerult);
		SaxHandler handler = new SaxHandler();
		handler.pasreXML(XMLData);
	}

	//
	// public Vector getResult() {
	// return result;
	// }

	public void build(String XMLData) {
		builder.isValidOrder(XMLData);
		builder.addItems();
		builder.calcShipping();
		builder.calcTax();

	}

}
