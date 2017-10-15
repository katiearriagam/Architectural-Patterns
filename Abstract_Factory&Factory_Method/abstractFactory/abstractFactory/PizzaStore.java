public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("---------//////--------///--------------&&----------");
		System.out.println("---" +  pizza.getName() + " ---");
		pizza.createDough();
		pizza.addSauce();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}