public class MetropolisPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{


	public Dough createDough() {
		return new ThickCrustDough();
	}
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	public Jamon createJamon() {
		return new JamonDePavo();
	}
	public Pineapple createPineapple() {
		return new PineappleAlmibar();
	}
	public Alcachofas createAlcachofas() {
		return new AlcachofasFrescas();
	}

}