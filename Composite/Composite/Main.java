/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

public class Main {

    public static void main(String[] args) {

        // Se crea cada uno de los menus compuestos, siendo
        //  el menu principal el de más jerarquía
        CompositeMenu principal = new MenuPrincipal();

        CompositeMenu dinner = new DinnerHome();

        CompositeMenu pancake = new PancakeHouse();

        CompositeMenu desserts = new Desserts();

        CompositeMenu kids = new Kids();

        CompositeMenu coffee = new Coffee();

        // Se crean las asociacoines entre los submenus
        // para crear la estructura de arbol
        dinner.subMenus.add(desserts);
        pancake.subMenus.add(kids);
        principal.subMenus.add(dinner);
        principal.subMenus.add(pancake);
        principal.subMenus.add(coffee);

        // Se impimen los contenidos de todos los menus en la
        // jerarquia
        principal.printAllMenusWithItems();

        // Se hace una busqueda de menus por el nombre del mismo
        CompositeMenu searchMenu = principal.findSubMenuByName("Kids");
        System.out.println("Menu by search -----------------");
        searchMenu.printCurrentMenu();
    }
}
