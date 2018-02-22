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
public class CentralCityArtichokePizza extends Pizza {
	public CentralCityArtichokePizza() {
		name = "CentralCIty Deep Dish Artichoke Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Artichoke");
		toppings.add("Eggplant");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
