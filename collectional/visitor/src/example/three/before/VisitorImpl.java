package example.three.before;

public class VisitorImpl implements Visitor {
	public void visit(Wensleydale w) {
		System.out.println(w.wensleydaleName());
	}

	public void visit(Gouda g) {
		System.out.println(g.goudaName());
	}

	public void visit(Brie b) {
		System.out.println(b.brieName());
	}
}
