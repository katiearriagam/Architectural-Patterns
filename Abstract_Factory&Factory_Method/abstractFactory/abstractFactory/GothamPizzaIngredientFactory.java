public class GothamPizzaIngredientFactory
        implements PizzaIngredientFactory
{


    public Dough createDough() {
        return new BatiDough();
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Cheese createCheese() {
        return new BatiMozzarella();
    }
    public Jamon createJamon() {
        return new JamonDePavo();
    }
    public Pineapple createPineapple() {
        return new BatiPineapple();
    }
    public Alcachofas createAlcachofas() {
        return new AlcachofasFrescas();
    }


}