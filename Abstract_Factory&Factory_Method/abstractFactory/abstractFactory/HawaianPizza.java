public class HawaianPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public HawaianPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        //dough = ingredientFactory.createDough();
        //sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        Jamon jamon = ingredientFactory.createJamon();
        Pineapple pineapple = ingredientFactory.createPineapple();
        System.out.println("Anadiendo ingredientes: " + cheese + ", " + jamon + ", " + pineapple );
    }
}