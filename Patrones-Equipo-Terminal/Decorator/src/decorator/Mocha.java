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
public class Mocha extends CondimentDecorator {
	Bebida bebida;
	public Mocha(Bebida bebida) {
		this.bebida = bebida;}
	public String getDescripcion ( ) {
		return bebida.getDescripcion( ) + ", Mocha";}
	public double costo ( ) {
		return .20 + bebida.costo ( );}
}