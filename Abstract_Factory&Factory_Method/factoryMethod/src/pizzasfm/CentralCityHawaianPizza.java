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
public class CentralCityHawaianPizza extends Pizza {
	public CentralCityHawaianPizza() {
		name = "Central City Hawaian Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Pineapple Express");
                toppings.add("cubbed Ham");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
