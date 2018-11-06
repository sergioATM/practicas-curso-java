/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import es.indra.aerolineas.beans.IAerolinea;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea  implements IAerolinea{
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#consultarVuelosOrigen(java.lang.String)
	 */
	@Override
	public  String consultarVuelosOrigen(String origen) {

		return origen;
		
	}
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#consultarVuelosOrigen(java.lang.String, java.lang.String)
	 */
	@Override
	public String consultarVuelosOrigen(String origen, String destino) {
			
		return origen + " " + destino;
		
	}
	
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#anularVuelos(java.lang.String)
	 */
	@Override
	public void anularVuelos(String...vuelos) {
		System.out.println("Numero de vuelos a anular: " + vuelos.length);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the vuelos
	 */
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	
	
	
	
	

}
