/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

import java.util.ArrayList;

// Hereda de la clase CompositeMenu
public class Desserts extends CompositeMenu {
    public ArrayList<String> dishes;

    // Se agregan los items del menu
    Desserts() {
        super("Desserts");
        dishes = new ArrayList<String>();
        dishes.add("Cheesecake");
        dishes.add("Key Lime Pie");
        dishes.add("Chocolate Ice-Cream");
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
