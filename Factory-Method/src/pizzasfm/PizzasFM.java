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
public class PizzasFM {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaStore StarCityStore = new StarCityPizzaStore();
		PizzaStore CentralCityStore = new CentralCityPizzaStore();
                PizzaStore MetropolisStore = new MetropolisPizzaStore();
		PizzaStore GothamStore = new GothamPizzaStore();
 
		Pizza pizza = StarCityStore.orderPizza("cheese");
		System.out.println("Regina ordered a " + pizza.getName() + "\n");
 
		pizza = CentralCityStore.orderPizza("cheese");
		System.out.println("Donato ordered a " + pizza.getName() + "\n");

		pizza = StarCityStore.orderPizza("hawaian");
		System.out.println("Michelle ordered a " + pizza.getName() + "\n");
 
		pizza = CentralCityStore.orderPizza("hawaian");
		System.out.println("Laura ordered a " + pizza.getName() + "\n");

		pizza = MetropolisStore.orderPizza("pepperoni");
		System.out.println("Estefania ordered a " + pizza.getName() + "\n");
 
		pizza = GothamStore.orderPizza("pepperoni");
		System.out.println("William ordered a " + pizza.getName() + "\n");

		pizza = MetropolisStore.orderPizza("artichoke");
		System.out.println("Miguel ordered a " + pizza.getName() + "\n");
 
		pizza = GothamStore.orderPizza("artichoke");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");// TODO code application logic here
    }
    
}
