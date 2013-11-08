package example.five;

//Decorator Sprinkles that mixes sprinkles with coffee
//note it extends CoffeeDecorator
public class Sprinkles extends CoffeeDecorator {

	public Sprinkles(Coffee decoratedCoffee) {
		super(decoratedCoffee);
		// TODO Auto-generated constructor stub
	}

	public double getCost() {
		return super.getCost() + 0.2;
	}

	public String getIngredients() {
		return super.getIngredients() + ingredientSeparator + "Sprinkles";
	}
}
