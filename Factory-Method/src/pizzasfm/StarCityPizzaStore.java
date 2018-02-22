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
public class StarCityPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new StarCityCheesePizza();
        	} else if (item.equals("hawaian")) {
        	    	return new StarCityHawaianPizza();
        	} else if (item.equals("artichoke")) {
        	    	return new StarCityArtichokePizza();
        	} else if (item.equals("pepperoni")) {
            		return new StarCityPepperoniPizza();
        	} else return null;
	}
}

