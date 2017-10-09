package state;

public class Main {

	public static void main(String[] args) {
		VendingMachine vending = new VendingMachine();
		vending.SetStockLeft(10);
		vending.SellGum();
		vending.SetStockLeft(0);
		vending.SellGum();
		vending.CloseReader();
	}

}
