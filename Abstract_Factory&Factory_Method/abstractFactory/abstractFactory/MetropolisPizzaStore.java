public class MetropolisPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new MetropolisPizzaIngredientFactory();


		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Metropolis Preparando una Pizza de Queso");
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Metropolis Preparando una Pizza de Pepperoni");

		}

		 else if (item.equals("alcachofas")) {

			pizza = new AlcachofaPizza(ingredientFactory);
			pizza.setName("Metropolis Preparando una Pizza de Alcachofas");

		} else if (item.equals("hawaiana")) {

            pizza = new HawaianPizza(ingredientFactory);
            pizza.setName("Metropolis Preparando una Pizza Hawaina");
        }

		ThickCrustDough thickCrustDough = new ThickCrustDough();
		pizza.setDough(thickCrustDough);
		pizza.setTimeAndTemp(50,300);
		return pizza;
	}
	
}
