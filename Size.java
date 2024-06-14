import javax.swing.JOptionPane;

public class Size {
	@Override
	public String toString() {
		return " [size = " + size + "]";
	}

	private char size;
	private double small = 0; // no price change
	private double regular = 1.25; // additional price
	private double large = 2.50; // additional price
	protected double basePrice = 0; // will be overridden

	/* This class will be the parent of Drink and side class */

	public Size(char size) {
		while (true) {

			if (Character.toUpperCase(size) == 'S' || Character.toUpperCase(size) == 'R'
					|| Character.toUpperCase(size) == 'L') {
				this.size = size;
				break;

			} else {
				JOptionPane.showMessageDialog(null, "Size entered is incorrect! Default set to Regular");
				this.size = 'R';
			}

		}

	}

	protected void priceChange() {
		// this method will change the basePrice according to size
		if (size == 'S') {
			basePrice += small;
		} else if (size == 'R') {
			basePrice += regular;
		} else if (size == 'L') {
			basePrice += large;
		}
	}

}
