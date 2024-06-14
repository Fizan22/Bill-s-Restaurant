import javax.swing.JOptionPane;

public class Drink extends Size {
	private String type; // type of drink
	protected double price = 1.25; // standard price of drink if size is small

	/*
	 * type of drink:- Fanta - Cola - Sprite
	 */

	public Drink(char size) {
		super(size);

		while (true) {

			String input = JOptionPane.showInputDialog("Please Type in the Type " + "of drink you see available: "
					+ "\r\n" + "Fanta\r\n" + "Cola\r\n" + "Sprite\r\n");

			if (input.equalsIgnoreCase("Sprite") || input.equalsIgnoreCase("Cola") || input.equalsIgnoreCase("Fanta")) {
				this.type = input;
				break;

			} else {
				JOptionPane.showMessageDialog(null, "Drink entered is not available. Choose another Drink!");
			}

		}
		priceChange();
	}

	@Override
	protected void priceChange() {
		// TODO Auto-generated method stub
		super.priceChange();
		this.price += basePrice; // updates the price of drink according to size
	}

	@Override
	public String toString() {
		return "\r\n\t" + type + "\r\n\tprice of drink = $" + price + super.toString() + "]";
	}

}
