package test.eje2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import eje2.Componente;
import eje2.Reporte;
import eje2.YaExisteDecorador;

class testReporte {

	String ruta    = "C:\\Users\\Usuario\\Documents\\2 - UNIVERSIDAD RODRI\\Orientacion a Objetos 2\\Persistencia\\Reporte.txt";

	File   archivo = new File(ruta);

//---------> ¿PUEDO ACCEDER A DISCO? CREO QUE ESTA MAL. <---------------------

	@Test
	void test() throws IOException {

		String     msj     = "Este es el SEGUNDO msj para el test";
		Componente reporte = new YaExisteDecorador(new Reporte(msj));
		reporte.export(archivo);

		String  datosLeidos = "";
		Scanner scanner     = new Scanner(archivo);
		while (scanner.hasNextLine()) {
			datosLeidos += scanner.nextLine();

			assertTrue(datosLeidos.equals(msj));

		}

	}
}
