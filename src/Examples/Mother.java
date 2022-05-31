package Examples;

public class Mother {
	public static void main(String[] args) {
		Shop s = new Shop();
		IceCream ic = s.shopKeeper();

		Child c = new Child();
		c.open(ic);
		c.lick(ic);

	}

}
