package example.five;

//Decorator Whip that mixes whip with coffee
//note it extends CoffeeDecorator
public class Whip extends CoffeeDecorator {

	public Whip(Coffee decoratedCoffee) {
		super(decoratedCoffee);
		// TODO Auto-generated constructor stub
	}

	public double getCost() {
		return super.getCost() + 0.7;
	}

	public String getIngredients() {
		return super.getIngredients() + ingredientSeparator + "Whip";
	}
}
