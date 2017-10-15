/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

// Hereda de la clase CompositeMenu
	// No tiene items, es solo para la coleccion de los menus
public class MenuPrincipal extends CompositeMenu {
    MenuPrincipal() {
        super("Menu principal");
    }

    // Se especializa la funcion heredada printCurrentMenu
    @Override
    public void printCurrentMenu() {}
}
