package example.two;

import example.two.taghtml.*;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HTML html = new HTML();

		HEAD head = new HEAD();
		BODY body = new BODY();

		html.addComponent(head);
		html.addComponent(body);

		TITLE title = new TITLE("Hello Composite Pattern!");
		head.addComponent(title);

		DIV div1 = new DIV();
		DIV div1Inner = new DIV();

		div1.addComponent(div1Inner);

		DIV div2 = new DIV();

		H1 h1 = new H1("This is an H1 tag");
		div2.addComponent(h1);

		body.addComponent(div1);
		body.addComponent(div2);

		html.print(0);

	}
}
