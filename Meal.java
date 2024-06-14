import javax.swing.JOptionPane;

public class Meal {

	private BurgerType burger;
	private Drink drink;
	private Sides side;

	public Meal() {

		int input2 = Integer.parseInt(JOptionPane.showInputDialog(
				"Please Enter Number Of Topping's You Would Like In Your Burger, Choose Up To 3 Please!"));
// takes in Number Of Topping's

		burger = new BurgerType(input2); // activates burger type class

		String input3 = JOptionPane.showInputDialog(null,
				"Please Choose Your Size Of Drink You Would Like! Enter S for Small, Enter R for Regular, or L for Large.");

		drink = new Drink((input3.charAt(0)));

		String input4 = JOptionPane.showInputDialog(
				"Please Choose Your Size Of Sides You Would Like! Enter S for Small, Enter R for Regular, or L for Large.");

		side = new Sides(input4.charAt(0));
		Bill();

	}

	public void Bill() {
		JOptionPane.showMessageDialog(null,
				"\r\t\nTotal Bill = $" + (Double) Math.ceil((burger.price + drink.price + side.price) * 100) / 100
						+ " \r\n\t" + burger + "\r\n\t" + drink + "\r\n\t" + side,
				"Your Bill!", JOptionPane.INFORMATION_MESSAGE);
	}

}
