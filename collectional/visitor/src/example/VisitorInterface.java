package example;

import example.impl.CaliforniaOrder;
import example.impl.NonCaliforniaOrder;
import example.impl.OverseaOrder;

public interface VisitorInterface {
	public void visit(NonCaliforniaOrder nco);
	public void visit(CaliforniaOrder co);
	public void visit(OverseaOrder oo);
}
