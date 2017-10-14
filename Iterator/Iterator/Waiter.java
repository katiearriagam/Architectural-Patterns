/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

public class Waiter {
    public Container[] restaurants;

    /*
    * getMenus
    *   Descripcion:
    *       Despliega todos los elementos de los menus 
    *   Parametros:
    *       -Nada-
    *   Retorno:
    *       -Nada-
    */
    public void getMenus(){
        for (Container restaurant: restaurants) {
            System.out.println("Las opciones para el restaurante "+restaurant.getRestaurantName()+" son:");
            restaurant.getIterator();
            for(Iterator it = restaurant.getIterator(); it.hasNext();){
                System.out.println(it.next());
            }
            System.out.println("");
        }
    }
}
