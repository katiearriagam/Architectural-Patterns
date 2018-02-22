public class AlcachofaPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public AlcachofaPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {

        dough = ingredientFactory.createDough();
        //sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        Alcachofas alcachofa = ingredientFactory.createAlcachofas();
        System.out.println("Anadiendo ingredientes: " + cheese +", " + alcachofa);
    }
}