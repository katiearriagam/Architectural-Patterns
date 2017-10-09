package proxy;

public class Main {

	public static void main(String[] args) {
		VendingMachineProxy vending = new VendingMachineProxy();
		vending.SetStockLeft(10);
		vending.SellGum();
		vending.SetStockLeft(0);
		vending.SellGum();
		vending.CloseReader();
	}

}
