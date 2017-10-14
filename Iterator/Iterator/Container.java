/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

public interface Container {

	/*
    * getIterator
    *   Descripcion:
    *       Regresa el iterador asociado al contenedor
    *   Parametros:
    *       -Nada-
    *   Retorno:
    *       Objeto tipo Iterator
    */
    public Iterator getIterator();

    /*
    * getRestaurantName
    *   Descripcion:
    *       Regresa el nombre del restaurant asociado al contenedor
    *   Parametros:
    *       -Nada-
    *   Retorno:
    *       Objeto tipo String
    */
    public String getRestaurantName();
}
