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
public class CentralCityPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new CentralCityCheesePizza();
        	} else if (item.equals("hawaian")) {
        	    	return new CentralCityHawaianPizza();
        	} else if (item.equals("artichoke")) {
        	    	return new CentralCityArtichokePizza();
        	} else if (item.equals("pepperoni")) {
            		return new CentralCityPepperoniPizza();
        	} else return null;
	}
}
