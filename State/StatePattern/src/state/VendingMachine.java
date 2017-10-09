package state;

import java.util.Scanner;

public class VendingMachine {
	// amount of gum left in stock
	private int stockLeft = 0;
	
	// initial state
	private int currentState = 0;
	
	// machine-user interaction reader
	static Scanner reader = new Scanner(System.in);
	
	// possible states for the vending machine
    private static State[] states = {new NoCoin(), new CoinInserted(), new SoldGum(), new NoGum(), new Error()};
    
    // transitions given user actions
    private int[][] transitions = new int[5][2];
    
    VendingMachine(){
    	// set up transition matrix
    	transitions[0][0] = 1;
    	transitions[0][1] = 0;
    	transitions[1][0] = 4;
    	transitions[1][1] = 2;
    	transitions[2][0] = 1;
    	transitions[2][1] = 4;
    	transitions[3][0] = 1;
    	transitions[3][1] = 3;
    	transitions[4][0] = 4;
    	transitions[4][1] = 4;
    }
    
    // setter for stock left
    public void SetStockLeft(int amount) {
    	stockLeft = amount;
    }
    
    // method for closing the reader
    public void CloseReader() {
    	reader.close();
    }
    
    // method for refilling the vending machine
    public void Refill(int amount) {
    	if(amount > 0) {
    		stockLeft = stockLeft + amount;
    		transitions[1][1] = 2;
    		System.out.println("Refilled vending machine: " + stockLeft + " in stock!!!");
    	}
    }
    
    // method for getting user input
    public int GetUserInput() {
    	int n = 0; 
    	
    	while(n != 1 && n != 2) {
    		System.out.println("\t Choose an option:");
    		System.out.println("\t 1) Insert coin.");
        	System.out.println("\t 2) Turn crack.");
    		System.out.println("Enter a number: ");
        	n = reader.nextInt();
    	}
    	
    	return n - 1;
    }
    
    // where the magic happens
    public void SellGum() {
    	int userOption = 0;
    	
    	if(stockLeft <= 0) {
    		transitions[1][1] = 3;
    	}
    	
    	do{
    		states[currentState].print();
    		userOption = GetUserInput();
    		currentState = transitions[currentState][userOption];
    	} while(currentState < 2);
    	
    	states[currentState].print();
    	
    	// only update stock if gum was sold
    	if(currentState == 2) {
    		stockLeft = stockLeft - 1;
    	}
    	
    	// go back to initial state
    	currentState = 0; 
    	System.out.println("END!\n\n");
    }
    
    
}
