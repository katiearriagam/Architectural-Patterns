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
public class Crema extends CondimentDecorator {
	Bebida bebida;
	public Crema(Bebida bebida) {
		this.bebida = bebida;}
	public String getDescripcion ( ) {
		return bebida.getDescripcion( ) + ", Crema";}
	public double costo ( ) {
		return 1.0 + bebida.costo ( );}
}