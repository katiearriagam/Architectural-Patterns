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
public class LecheEntera extends CondimentDecorator {
	Bebida bebida;
	public LecheEntera(Bebida bebida) {
		this.bebida = bebida;}
	public String getDescripcion ( ) {
		return bebida.getDescripcion( ) + ", Leche Entera";}
	public double costo ( ) {
		return .10 + bebida.costo ( );}
}