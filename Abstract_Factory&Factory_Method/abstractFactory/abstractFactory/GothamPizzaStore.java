public class GothamPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new GothamPizzaIngredientFactory();


        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Gothanm Preparando una BatiPizza de Queso");
        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Gothanm Preparando una BatiPizza de Pepperoni");

        }

        else if (item.equals("alcachofas")) {

            pizza = new AlcachofaPizza(ingredientFactory);
            pizza.setName("Gothanm Preparando una BatiPizza de Alcachofas");

        } else if (item.equals("hawaiana")) {

            pizza = new HawaianPizza(ingredientFactory);
            pizza.setName("Gothanm Preparando una BatiPizza Hawaina");
        }

        BatiDough batiDough = new BatiDough();
        pizza.setDough(batiDough);
        pizza.setTimeAndTemp(45,328);
        return pizza;
    }

}
