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
public class MetropolisPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new MetropolisCheesePizza();
        	} else if (item.equals("hawaian")) {
        	    	return new MetropolisHawaianPizza();
        	} else if (item.equals("artichoke")) {
        	    	return new MetropolisArtichokePizza();
        	} else if (item.equals("pepperoni")) {
            		return new MetropolisPepperoniPizza();
        	} else return null;
	}
}
