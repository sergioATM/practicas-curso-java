/**
 * 
 */
package es.indra.aerolinea.services;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author aula11
 *
 */
public class ReadFiles {
	
	public void retornarVuelos() {
		Path path = Paths.get("/Users/aula11/repositorios/CursoJava/vuelos.txt");
	
	
	try {
		List<String> contenido = Files.readAllLines(path);
		
		System.out.println(contenido);
		
		
	}catch (IOException e) {
		e.printStackTrace();
		
	}
	}
	public static void main(String[] args) {
		ReadFiles r = new ReadFiles();
		r.retornarVuelos();
		
	}
}

