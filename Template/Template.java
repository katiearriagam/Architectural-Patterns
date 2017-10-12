/**
 * Template pattern
 * 
 * Elias Mera 
 * Fabian Montemayor
 * Gala Islas
 * Maria Paula Anastas
 */

abstract class Beverage {

	public final void makeBeverage() {
    	boilWater();
    	additionalSteps();
    	pourInCup();
    	addTopings();
	}

	// same methods for both classes
	protected void boilWater(){
		System.out.println("We are boiling water");
	}

	protected void pourInCup(){
		System.out.println("Pouring into the cup");
	}
	// Abstract methods
	protected abstract void additionalSteps();
	protected abstract void addTopings();
}

class Tea extends Beverage {

	protected void additionalSteps(){
		System.out.println("Steeping the teabag in the water");
	}

	protected void addTopings(){
		System.out.println("Adding lemon");
	}

}

class Coffee extends Beverage {

	protected void additionalSteps(){
		System.out.println("Brew the coffegrinds");
	}

	protected void addTopings(){
		System.out.println("Adding sugar");
		System.out.println("Adding milk");
	}

}

// client

public class Template {

	public static void main(String[] args) {
		// makes one beverage of each
    	Beverage myTea = new Tea();
    	Beverage myCoffe = new Coffee();
    	System.out.println("Making a Tea");
    	myTea.makeBeverage();
    	System.out.println();
    	System.out.println("Making a Coffee");
    	myCoffe.makeBeverage();
  	}

}