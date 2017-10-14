/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

public interface Iterator {
	/*
    * hasNext
    *   Descripcion:
    *       Para revisar si el contenedor tiene otro elemento
    *   Parametros:
    *       -Nada-
    *   Retorno:
    *       Valor tipo booleano
    */
    public boolean hasNext();

    /*
    * next
    *   Descripcion:
    *       Para obtener el siguiente elemento del contenedor
    *   Parametros:
    *       -Nada-
    *   Retorno:
    *       Objeto del contenedor
    */
    public Object next();
}
