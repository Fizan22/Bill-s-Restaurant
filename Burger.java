import javax.swing.JOptionPane;

public class Burger {

	protected double basePrice = 3.50; // base price of all type of burger
	private int toppings;

	public Burger(int toppings) {
		while (true) {

			if (toppings >= 0 && toppings <= 3) {
				this.toppings = toppings;

				break;

			} else {
				JOptionPane.showMessageDialog(null, "Number Of Toppings are not to exceed above 3! Default Set To 2");
				this.toppings = 2;
				break;
			}

		}

		toppingAddition();
	}

	public int getToppings() {
		return toppings;
	}

	private void toppingAddition() {
		// each topping costs 0.75 USD
		this.basePrice += (0.75 * toppings);
	}

}
