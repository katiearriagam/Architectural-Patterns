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
public class LecheLight extends CondimentDecorator {
	Bebida bebida;
	public LecheLight(Bebida bebida) {
		this.bebida = bebida;}
	public String getDescripcion ( ) {
		return bebida.getDescripcion( ) + ", Leche Light";}
	public double costo ( ) {
		return .25 + bebida.costo ( );}
}