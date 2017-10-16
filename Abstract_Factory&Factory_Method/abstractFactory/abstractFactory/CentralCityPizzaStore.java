public class CentralCityPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new CentralCityPizzaIngredientFactory();


        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Central City Preparando una Pizza de Queso");
        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Central City Preparando una Pizza de Pepperoni");

        }

        else if (item.equals("alcachofas")) {

            pizza = new AlcachofaPizza(ingredientFactory);
            pizza.setName("Central City Preparando una Pizza de Alcachofas");

        } else if (item.equals("hawaiana")) {

            pizza = new HawaianPizza(ingredientFactory);
            pizza.setName("Central City Preparando una Pizza Hawaina");
        }

        FlashyDough flashyDough = new FlashyDough();
        pizza.setDough(flashyDough);
        pizza.setTimeAndTemp(45,320);
        return pizza;
    }

}
