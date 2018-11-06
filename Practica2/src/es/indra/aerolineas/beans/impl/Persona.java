/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author aula11
 *
 */
public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected int id;
	
	/**
	 * @return the nombre
	 */
	public Persona() {
		super();
	}
	
	public abstract String solicitarInformacion();
	/**
	 * @return the nombre
	 */
	
	public String getNombre() {
		return nombre.toUpperCase();
		
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
	