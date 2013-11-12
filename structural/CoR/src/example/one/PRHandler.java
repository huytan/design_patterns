package example.one;

public abstract class PRHandler {
	private PRHandler nextHandler;
	private String handlerName;

	public PRHandler(String name) {
		handlerName = name;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public abstract boolean authorize(PurchaseRequest request);

	public PRHandler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(PRHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
