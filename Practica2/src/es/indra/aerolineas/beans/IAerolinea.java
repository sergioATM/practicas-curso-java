package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolinea {

	String consultarVuelosOrigen(String origen);

	String consultarVuelosOrigen(String origen, String destino);

	void anularVuelos(String... vuelos);
	
	 String getNombre();
		
	Vuelo[] getVuelos();
	

	


}