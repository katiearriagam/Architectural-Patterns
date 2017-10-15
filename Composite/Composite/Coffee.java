/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

import java.util.ArrayList;

// Hereda de la clase CompositeMenu
public class Coffee extends CompositeMenu {
    public ArrayList<String> dishes;

    // Se agregan los elementos del menu
    Coffee() {
        super("Coffe");
        dishes = new ArrayList<String>();
        dishes.add("Americano");
        dishes.add("Espresso");
        dishes.add("Latte");
        dishes.add("Chemex");
        dishes.add("French Press");

    }

    // Se especializa la funcion heredada printCurrentMenu
    @Override
    public void printCurrentMenu() {
        if(!dishes.isEmpty()){
            System.out.println("Menu de "+menuName+":");
            for (String item: dishes) {
                System.out.println("\t"+item);
            }
        }
        System.out.println();
    }
}
