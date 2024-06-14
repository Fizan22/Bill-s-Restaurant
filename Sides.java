import javax.swing.JOptionPane;

public class Sides extends Size {

	private String type; // type of side
	protected double price = 1.95; // standard price of side if size is small
	// type of sides: fries, onion rings, coleslaw

	public Sides(char size) {
		super(size);

		while (true) {
			String input = JOptionPane.showInputDialog("Please Type in the Type " + "of sides you see available: "
					+ "\r\n" + "Fries\r\n" + "Onion Rings\r\n" + "Coleslaw\r\n");

			if (input.equalsIgnoreCase("fries") || input.equalsIgnoreCase("onion rings")
					|| input.equalsIgnoreCase("coleslaw")) {
				this.type = input;
				break;

			} else {
				JOptionPane.showMessageDialog(null, "Side entered is not available. Choose another Side!");
			}

		}
		priceChange();
	}

	@Override
	protected void priceChange() {
		// TODO Auto-generated method stub
		super.priceChange();
		this.price += basePrice; // change of price depending on Size
	}

	@Override
	public String toString() {
		return "\r\n\t" + type + ", price = $" + price + super.toString() + "]";
	}

}
