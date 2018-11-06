/**
 * 
 */
package es.indra.aerolineas.main;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author josejarizav
 *
 */
public class Venta {
	
	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {	
			int a = (int) (Math.random()*10+1);
			vuelos[i] = new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   );
		}
		return vuelos;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vuelo[] vuelos = creaVuelos();
		
		IAerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		Empleado emp = new Empleado();
		
		emp.setNombre("Vendedor 1");
		
		Pasajero p = new Pasajero();
		
		Vuelo[] vuelosPasajero = {vuelos[0], vuelos[4]};
		
		p.setId(10);
		p.setNombre ("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setVuelos (vuelosPasajero);
		
		aa.anularVuelos();
		aa.anularVuelos("UX22");
		aa.anularVuelos("XC55", "CE33");
		
		
		
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		
		System.out.println("|\tLe atiende: ".concat(emp.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.getVuelos().length);
		
		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(), p.getVuelos().length );
		
		System.out.printf("|\tVuelo Origen " + aa.consultarVuelosOrigen("MAD"));
		
		System.out.printf("|\tVuelo Origen Destino " + aa.consultarVuelosOrigen("MAD","BCN"));
		
		System.out.println();
		System.out.println("*************************************************************************");
		
		
		

	}

}
