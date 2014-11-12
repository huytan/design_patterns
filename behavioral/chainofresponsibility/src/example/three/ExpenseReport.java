package example.three;

public class ExpenseReport {
	private int totalDollarAmount;
	private boolean isInternationalTravel;
	private State state = State.initial;
	private Approver handler;

	public int getTotalDollarAmount() {
		return totalDollarAmount;
	}

	public void setTotalDollarAmount(int amount) {
		totalDollarAmount = amount;
	}

	public boolean isInternationalTravel() {
		return isInternationalTravel;
	}

	public void setIsInternationalTravel(boolean isInternationalTravel) {
		this.isInternationalTravel = isInternationalTravel;
	}
	
	public void reject(){
		state = State.rejected;
	}
	
	public void approve(Approver approver){
		this.handler = approver;
		//save database
		state = State.approved;
	}
	
	public State state() {
	      return state;
	}
	
	 public Approver getHandler() {
      return handler;
   }
	
}
