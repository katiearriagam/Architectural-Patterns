/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

import java.util.ArrayList;

public class PancakeHouse implements Container {
    public ArrayList<String> dishes;

    PancakeHouse() {
        dishes = new ArrayList<String>();
        dishes.add("Omelette");
        dishes.add("Pancake Stack");
        dishes.add("Hash Browns");
        dishes.add("Full English Breakfast");
    }

    @Override
    public Iterator getIterator() {
        return new PHIterator();
    }

    // Instanciacion de la interfaz Iterator
    private class PHIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < dishes.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return dishes.get(index++);
            }
            return null;
        }
    }

    @Override
    public String getRestaurantName() {
        return "Pancake House";
    }
}
