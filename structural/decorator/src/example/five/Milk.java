package example.five;


public class Milk extends CoffeeDecorator {

	public Milk(Coffee decoratedCoffee) {
		super(decoratedCoffee);
		// TODO Auto-generated constructor stub
	}

	public double getCost() { // overriding methods defined in the abstract
								// superclass
		return super.getCost() + 0.5;
	}

	public String getIngredients() {
		return super.getIngredients() + ingredientSeparator + "Milk";
	}
}
