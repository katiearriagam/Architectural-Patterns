public class StarCityPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new StarCityPizzaIngredientFactory();


        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Star City Preparando una Pizza de Queso");
        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Star City Preparando una Pizza de Pepperoni");

        }

        else if (item.equals("alcachofas")) {

            pizza = new AlcachofaPizza(ingredientFactory);
            pizza.setName("Star City Preparando una Pizza de Alcachofas");

        } else if (item.equals("hawaiana")) {

            pizza = new HawaianPizza(ingredientFactory);
            pizza.setName("Star City Preparando una Pizza Hawaina");
        }

        StarryDough starryDough = new StarryDough();
        pizza.setDough(starryDough);
        pizza.setTimeAndTemp(55,280);
        return pizza;
    }

}
