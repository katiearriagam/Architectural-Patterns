/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

public class Main {

    public static void main(String[] args) {
    	// Se agregan los restaurantes correspondientes
        Container[] currentRestaurants = {new PancakeHouse(), new DinnerHome()};
        // Se crea el mesero que atendera
        Waiter waiter = new Waiter();

        // Se le asignan los restaurantes al mesero
        waiter.restaurants = currentRestaurants;

        // El mesero accede a todos los platillos de los restaurantes
        waiter.getMenus();
    }
}
