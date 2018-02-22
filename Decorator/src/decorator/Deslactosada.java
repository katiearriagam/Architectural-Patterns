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
public class Deslactosada extends CondimentDecorator {
	Bebida bebida;
	public Deslactosada(Bebida bebida) {
		this.bebida = bebida;}
	public String getDescripcion ( ) {
		return bebida.getDescripcion( ) + ", Deslactosada";}
	public double costo ( ) {
		return .10 + bebida.costo ( );}
}
