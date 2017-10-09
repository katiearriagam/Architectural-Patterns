package proxy;

public class VendingMachineProxy implements VendingMachineInterface{

	private VendingMachine vending = new VendingMachine();
	
	@Override
	public void SetStockLeft(int amount) {
		vending.SetStockLeft(amount);
	}

	@Override
	public void CloseReader() {
		vending.CloseReader();
	}

	@Override
	public void Refill(int amount) {
		vending.Refill(amount);
	}

	@Override
	public void SellGum() {
		vending.SellGum();
	}

}
