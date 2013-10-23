package example.two_interface;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import example.two_interface.builder.OrderBuilder;
import example.two_interface.builder.OrderDirector;
import example.two_interface.builder.OrderFactory;
import example.two_interface.util.XMLParser;

public class Main {
	static OrderBuilder builder;

	public static void main(String[] args) throws ParserConfigurationException {

		OrderFactory factory = new OrderFactory();
		builder = factory.getOrderBuilder("OH");
		OrderDirector director = new OrderDirector(builder);
		// director.build();
		Order orderML = director.parse("order.xml");
		director.build(orderML);
		Order order = builder.getOrder();
		order.save();
	}
}
