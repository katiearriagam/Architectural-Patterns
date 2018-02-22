/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Gabriel
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bebida bebida = new Espresso();
	System.out.println(bebida.getDescripcion() + " $" + bebida.costo());

	Bebida bebida2 = new DarkRoast();
	bebida2 = new Mocha(bebida2);
	bebida2 = new Mocha(bebida2);
	bebida2 = new Crema(bebida2);
	System.out.println(bebida2.getDescripcion() + " $" + bebida2.costo());

	Bebida bebida3 = new HouseBlend();
	bebida3 = new LecheSoya(bebida3);
	bebida3 = new Mocha(bebida3);
	bebida3 = new Crema(bebida3);
	System.out.println(bebida3.getDescripcion() + " $" + bebida3.costo());
    }
}