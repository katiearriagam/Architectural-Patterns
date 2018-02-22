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
public class GothamPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new GothamCheesePizza();
        	} else if (item.equals("hawaian")) {
        	    	return new GothamHawaianPizza();
        	} else if (item.equals("artichoke")) {
        	    	return new GothamArtichokePizza();
        	} else if (item.equals("pepperoni")) {
            		return new GothamPepperoniPizza();
        	} else return null;
	}
}
