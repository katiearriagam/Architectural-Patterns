public class CentralCityPizzaIngredientFactory
        implements PizzaIngredientFactory
{


    public Dough createDough() {
        return new FlashyDough();
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Cheese createCheese() {
        return new Mozzarella2Cheese();
    }
    public Jamon createJamon() {
        return new JamonDePavo();
    }
    public Pineapple createPineapple() {
        return new SpicyPineapple();
    }
    public Alcachofas createAlcachofas() {
        return new AlcachofasFrescas();
    }

}