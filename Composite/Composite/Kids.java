/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

import java.util.ArrayList;

// Hereda de la clase submenu
public class Kids extends CompositeMenu {
    public ArrayList<String> dishes;

    Kids() {
        super("Kids");
        dishes = new ArrayList<String>();
        dishes.add("Small Hamburger");
        dishes.add("Two Pancakes");
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
