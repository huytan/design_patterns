package example.two_interface.builder;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import example.two_interface.Order;
import example.two_interface.util.XMLParser;

public class OrderDirector {
	OrderBuilder builder;
	XMLParser parser;

	public OrderDirector(OrderBuilder builder) {
		this.builder = builder;
	}

	public Order parse(String fileName) throws ParserConfigurationException {
		parser = XMLParser.getInstance(fileName);
		Order order = parser.getAllOrder();

		return order;

	}

	public void build(Order order) {
		System.out.println(parser.getTotal());
		builder.isValidOrder(parser.getTotal());
		builder.calcTax();
		builder.calsShipping();
		builder.addItems(order.getItems().toString());
	}
}
