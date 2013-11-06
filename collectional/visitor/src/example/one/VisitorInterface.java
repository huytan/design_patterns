package example.one;

import example.one.impl.CaliforniaOrder;
import example.one.impl.NonCaliforniaOrder;
import example.one.impl.OverseaOrder;

public interface VisitorInterface {
	public void visit(NonCaliforniaOrder nco);
	public void visit(CaliforniaOrder co);
	public void visit(OverseaOrder oo);
}
