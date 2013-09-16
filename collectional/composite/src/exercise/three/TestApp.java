package exercise.three;

import example.one_abstract.CompositeException;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductSystemComponent computerCategory = new PCategory("Computers");
		ProductSystemComponent desktopCategory = new PCategory("Desktops");
		ProductSystemComponent laptopCategory = new PCategory("Laptops");
		ProductSystemComponent peripheralCategory = new PCategory("Peripherals");
		ProductSystemComponent cablesCategory = new PCategory("Cables");

		ProductSystemComponent hpItem = new PItem("HP destop", 130);
		ProductSystemComponent lgItem = new PItem("LG destop", 500);

		ProductSystemComponent ssItem = new PItem("Samsung laptop", 200);
		ProductSystemComponent sonyItem = new PItem("Sony laptop", 300);
		ProductSystemComponent appleItem = new PItem("Apple laptop", 500);

		try {
			computerCategory.addComponent(desktopCategory);
			computerCategory.addComponent(laptopCategory);

			desktopCategory.addComponent(hpItem);
			desktopCategory.addComponent(lgItem);

			laptopCategory.addComponent(ssItem);
			laptopCategory.addComponent(sonyItem);
			laptopCategory.addComponent(appleItem);

		} catch (CompositeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(computerCategory.name + ": "
				+ computerCategory.getDollarComponent() + " USD");// = 1600
		System.out.println(laptopCategory.name + ": "
				+ laptopCategory.getDollarComponent() + " USD"); // =1000
		System.out.println(desktopCategory.name + ": "
				+ desktopCategory.getDollarComponent() + " USD"); // =600
		System.out.println(hpItem.name + ": " + hpItem.getDollarComponent()
				+ " USD"); // =100
	}

}
