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

public abstract class CompositeMenu {
    public String menuName;
    public List<CompositeMenu> subMenus;

    CompositeMenu(String name){
        menuName = name;
        // to implement
        subMenus = new ArrayList<CompositeMenu>();
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
    public abstract void printCurrentMenu();

    /*
    * addSubMenuInChilds
    *   Descripcion:
    *       Agrega un submenu a la jerarquia del objeto
    *   Parametros:
    *       Objeto tipo Menu
    *   Retorno:
    *       -Nada-
    */
    public void addSubMenuInChilds(CompositeMenu sm){
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
    public void removeSubMenuInChilds(CompositeMenu sm){
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
        LinkedList<CompositeMenu> queue = new LinkedList<CompositeMenu>();
        queue.add(this);
        while (queue.size() != 0){
            CompositeMenu actual = queue.poll();
            actual.printCurrentMenu();
            for (CompositeMenu child: actual.subMenus) {
                queue.add(child);
            }
        }
    }

    /*
    * findSubMenuByName
    *   Descripcion:
    *       Busca el menu con el nombre dado en la jerarquia
    *       Regresa null si no se encuentra un submenu con ese nombre
    *   Parametros:
    *       String con el nombre de interes
    *   Retorno:
    *       Objeto tipo CompositeMenu correspondiente
    */
    public CompositeMenu findSubMenuByName(String name){
        LinkedList<CompositeMenu> queue = new LinkedList<CompositeMenu>();
        queue.add(this);
        while (queue.size() != 0){
            CompositeMenu actual = queue.poll();
            if(actual.menuName == name)
                return actual;
            for (CompositeMenu child: actual.subMenus) {
                queue.add(child);
            }
        }
        return null;
    }
}
