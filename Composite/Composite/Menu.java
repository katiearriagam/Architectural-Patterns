/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Menu {
    public String menuName;
    public List<String> menuItems;
    public List<Menu> subMenus;

    Menu(String name){
        menuName = name;
        menuItems = new ArrayList<String>();
        subMenus = new ArrayList<Menu>();
    }

    /*
    * printCurrentMenu
    *   Descripcion:
    *       Despliega el contenido del menu
    *   Parametros:
    *       -Nada-
    *   Retorno:
    *       -Nada-
    */
    public void printCurrentMenu(){
        if(!menuItems.isEmpty()){
            System.out.println("Menu de "+menuName+":");
            for (String item: menuItems) {
                System.out.println("\t"+item);
            }
        }
        System.out.println();
    }

    /*
    * addSubMenuInChilds
    *   Descripcion:
    *       Agrega un submenu a la jerarquia del objeto
    *   Parametros:
    *       Objeto tipo Menu
    *   Retorno:
    *       -Nada-
    */
    public void addSubMenuInChilds(Menu sm){
        subMenus.add(sm);
    }

    /*
    * removeSubMenuInChilds
    *   Descripcion:
    *       Remueve un submenu de la jerarquia del objeto
    *   Parametros:
    *       Objeto tipo Menu
    *   Retorno:
    *       -Nada-
    */
    public void removeSubMenuInChilds(Menu sm){
        subMenus.remove(sm);
    }

    /*
    * printAllMenusWithItems
    *   Descripcion:
    *       Despliega el contenido de todos los 
    *       menus en la jerarquia
    *   Parametros:
    *       -Nada-
    *   Retorno:
    *       -Nada-
    */
    public void printAllMenusWithItems(){
        LinkedList<Menu> queue = new LinkedList<Menu>();
        queue.add(this);
        while (queue.size() != 0){
            Menu actual = queue.poll();
            actual.printCurrentMenu();
            for (Menu child: actual.subMenus) {
                queue.add(child);
            }
        }
    }

    /*
    * findSubMenuByName
    *   Descripcion:
    *       Busca el menu con el nombre dado en la jerarquia
    *   Parametros:
    *       String con el nombre de interes
    *   Retorno:
    *       Objeto tipo Menu correspondiente
    */
    public Menu findSubMenuByName(String name){
        LinkedList<Menu> queue = new LinkedList<Menu>();
        queue.add(this);
        while (queue.size() != 0){
            Menu actual = queue.poll();
            if(actual.menuName == name)
                return actual;
            for (Menu child: actual.subMenus) {
                queue.add(child);
            }
        }
        return null;
    }
}
