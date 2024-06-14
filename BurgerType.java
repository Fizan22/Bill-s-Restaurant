
import javax.swing.JOptionPane;

public class BurgerType extends Burger {
	protected double price;
	private String type;
	private static final double hamburger = 0; // no price change
	private static final double chickenSupreme = 1.25; // additional price
	private static final double XLWhopper = 2.50; // additional price
	private String[] toppingtype;
	private StringBuilder displayTopping = new StringBuilder();

	public BurgerType(int toppings) {
		super(toppings);

		while (true) {

			String input = JOptionPane.showInputDialog(
					"Welcome to Bill's Restaurant! Please Type in the Type " + "of burger you see available: " + "\r\n"
							+ "Hamburger\r\n" + "Chicken Supreme\r\n" + "XLWhopper\r\n");

			if (input.equalsIgnoreCase("hamburger") || input.equalsIgnoreCase("chicken supreme")
					|| input.equalsIgnoreCase("xlwhopper")) {
				this.type = input;

				break;

			} else {
				JOptionPane.showMessageDialog(null,
						"Burger entered is not available or Spelling is Incorrect. Choose another Burger Available or Check Spelling!");
			}

		}

		toppingtype = new String[getToppings()]; // fixed array on topping's type
		int counter = 1;
		for (int i = 0; i < toppingtype.length; i++) {
			String input = JOptionPane.showInputDialog("Enter Topping " + counter
					+ " Of Your Choice! Recommended List are the following:" + "\r\n" + "\r\n" + "Bacon\r\n"

					+ "Caramelized Onions\r\n" + "Avocado\r\n" + "Pineapple\r\n" + "Fried Egg\r\n" + "Jalapeños\r\n"
					+ "Swiss Cheese\r\n" + "Mushrooms\r\n" + "Barbecue Sauce\r\n" + "Lettuce\r\n" + "Tomato\r\n"
					+ "Pickles\r\n" + "Blue Cheese\r\n" + "Grilled Peppers\r\n" + "Sriracha Mayo");
			toppingtype[i] = input;
			counter++;

		}
		calculatePrice();
	}

	private void generateToppingView() {
		if (toppingtype.length > 0) {
			for (String topping : toppingtype) {
				displayTopping.append(topping).append("\n");
			}
		}

	}

	@Override
	public String toString() {
		generateToppingView();
		return "\n\tprice Of Burger = $" + price + ", type of burger = " + type + ", Toppings: " + "\n"
				+ displayTopping.toString();
	}

	private void calculatePrice() {
		if (type.equalsIgnoreCase("hamburger")) {
			this.price = hamburger;
		} else if (type.equalsIgnoreCase("chicken supreme")) {
			this.price = chickenSupreme;
		} else if (type.equalsIgnoreCase("xlwhopper")) {
			this.price = XLWhopper;
		}
		this.price += basePrice; // changes price according to number of toppings

	}

}
