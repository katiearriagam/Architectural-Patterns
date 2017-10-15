/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

import java.util.ArrayList;

// Hereda de la clase CompositeMenu
public class PancakeHouse extends CompositeMenu {
    public ArrayList<String> dishes;

    // Se agregan los items del menu
    PancakeHouse() {
        super("Pancake House");
        dishes = new ArrayList<String>();
        dishes.add("Omelette");
        dishes.add("Pancake Stack");
        dishes.add("Hash Browns");
        dishes.add("Full English Breakfast");
    }

    // Se especializa la funcion heredada printCurrentMenu
    @Override
    public void printCurrentMenu(){
        if(!dishes.isEmpty()){
            System.out.println("Menu de "+menuName+":");
            for (String item: dishes) {
                System.out.println("\t"+item);
            }
        }
        System.out.println();
    }
}
