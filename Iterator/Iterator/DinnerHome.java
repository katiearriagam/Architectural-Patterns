/*
*   Codigo desarrollado por: Equipo Los Qarlos
*   Melissa Trevino, Axel Suarez,
*   Jose Manuel González, Jose Carlos Villarreal
*   
*
*/

import java.util.ArrayList;

public class DinnerHome implements Container {
    public String dishes[] = {"Dumplings","Roast Dinner","Pastor Tacos","Lasagne"};

    @Override
    public Iterator getIterator() {
        return new DHIterator();
    }

    // Instanciacion de la interfaz Iterator
    private class DHIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < dishes.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return dishes[index++];
            }
            return null;
        }
    }

    @Override
    public String getRestaurantName() {
        return "Dinner Home";
    }
}
