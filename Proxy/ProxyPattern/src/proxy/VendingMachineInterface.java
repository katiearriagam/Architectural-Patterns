package proxy;

public interface VendingMachineInterface {
	// setter for stock left
    public void SetStockLeft(int amount);
    
    // method for closing the reader
    public void CloseReader();
    
    // method for refilling the vending machine
    public void Refill(int amount);
    
    // where the magic happens
    public void SellGum();
}
