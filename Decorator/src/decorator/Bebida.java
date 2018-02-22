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
public abstract class Bebida {
 	String descripcion = "Bebida";
	public String getDescripcion ( ) {
		return descripcion;
	}
	public abstract double costo ( );   
}
