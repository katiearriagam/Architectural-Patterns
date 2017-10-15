/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

import java.util.Arrays;

// Hereda de la clase CompositeMenu
public class DinnerHome extends CompositeMenu {
    public String dishes[] = {"Dumplings","Roast Dinner","Pastor Tacos","Lasagne"};

    DinnerHome() {
        super("DinnerHome");
    }

    // Se especializa la funcion heredada printCurrentMenu
    @Override
    public void printCurrentMenu(){
        if(dishes.length > 0){
            System.out.println("Menu de "+menuName+":");
            for (String item: dishes) {
                System.out.println("\t"+item);
            }
        }
        System.out.println();
    }
}
