/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzasfm;

/**
 *
 * @author Carlos
 */
public class MetropolisHawaianPizza extends Pizza {
	public MetropolisHawaianPizza() {
		name = "Metropolis Super Hawaian Pizza";
		dough = "Extra Soft Dough";
		sauce = "Spicy Tomato Sauce";
 
		toppings.add("Shredded Swiss Cheese");
		toppings.add("Pineapple");
                toppings.add("sliced Ham");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
