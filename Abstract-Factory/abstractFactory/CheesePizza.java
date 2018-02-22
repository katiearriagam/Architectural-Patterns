public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		
		dough = ingredientFactory.createDough();
		//sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		System.out.println("Anadiendo ingredientes: " /*+ dough +", "*/+ cheese);
	}
}