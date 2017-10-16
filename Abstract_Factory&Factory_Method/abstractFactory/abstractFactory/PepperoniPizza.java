public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        dough = ingredientFactory.createDough();
        //sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        //veggies = ingredientFactory.createVeggies();
        Pepperoni pepperoni = ingredientFactory.createPepperoni();
        System.out.println("Anadiendo ingredientes: " + cheese + "," + pepperoni);
    }
}