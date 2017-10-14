/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

public class Main {

    public static void main(String[] args) {
        // Se crea el menu principal
        Menu principal = new Menu("Menu principal");

        // Menus "hijo" del menu principal
        Menu dinnerh = new Menu("Dinner Home");
        dinnerh.menuItems.add("Dumplings");
        dinnerh.menuItems.add("Roast Dinner");
        dinnerh.menuItems.add("Pastor Tacos");
        dinnerh.menuItems.add("Lasagne");

        Menu pancake = new Menu("Pancake House");
        pancake.menuItems.add("Omelette");
        pancake.menuItems.add("Pancake Stack");
        pancake.menuItems.add("Hash Browns");
        pancake.menuItems.add("Full English Breakfast");

        Menu dinner = new Menu("Dinner");
        dinner.menuItems.add("Hamburger");
        dinner.menuItems.add("Winner Winner Chicken Dinner");
        dinner.menuItems.add("Pork Chops");
        dinner.menuItems.add("Irish Stew");

        Menu desserts = new Menu("Desserts");
        desserts.menuItems.add("Cheesecake");
        desserts.menuItems.add("Key Lime Pie");
        desserts.menuItems.add("Chocolate Ice-Cream");

        Menu kids = new Menu("Kids");
        kids.menuItems.add("Small Hamburger");
        kids.menuItems.add("Two Pancakes");

        Menu coffee = new Menu("Coffee");
        coffee.menuItems.add("Americano");
        coffee.menuItems.add("Espresso");
        coffee.menuItems.add("Latte");
        coffee.menuItems.add("Chemex");
        coffee.menuItems.add("French Press");

        // Se hace la asociacion explicita del menu principal
        //  y los submenus
        dinner.subMenus.add(desserts);
        pancake.subMenus.add(kids);
        principal.subMenus.add(dinnerh);
        principal.subMenus.add(dinner);
        principal.subMenus.add(pancake);
        principal.subMenus.add(coffee);

        // Depsliegue de los menus que componen al menu principal
        principal.printAllMenusWithItems();

        // Demostracion de busqueda de menus por nombre
        //  Se busca primero al submenu Dinner y despues al submenu Desserts
        Menu searchMenu = principal.findSubMenuByName("Dinner").findSubMenuByName("Desserts");
        System.out.println("Menu by search -----------------");
        searchMenu.printCurrentMenu();
    }
}
