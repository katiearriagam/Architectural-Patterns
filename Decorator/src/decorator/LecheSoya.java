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
public class LecheSoya extends CondimentDecorator {
	Bebida bebida;
	public LecheSoya(Bebida bebida) {
		this.bebida = bebida;}
	public String getDescripcion ( ) {
		return bebida.getDescripcion( ) + ", Leche Soya";}
	public double costo ( ) {
		return .50 + bebida.costo ( );}
}