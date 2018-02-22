public class StarCityPizzaIngredientFactory
        implements PizzaIngredientFactory
{


    public Dough createDough() {
        return new StarryDough();
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Cheese createCheese() {
        return new StarryMozzarella();
    }
    public Jamon createJamon() {
        return new JamonDePavo();
    }
    public Pineapple createPineapple() {
        return new PineappleStars();
    }
    public Alcachofas createAlcachofas() {
        return new AlcachofasFrescas();
    }

}