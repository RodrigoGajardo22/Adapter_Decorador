package eje2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reporte implements Componente {

	private String reporte;

	public Reporte(String reporte) {
		this.reporte = reporte;
	}

	public void export(File file) {

		// Exportar el reporte a un archivo.

		try {
			FileWriter escribir = new FileWriter(file, false);
			escribir.write(reporte);
			escribir.write("\r\n");
			escribir.close();
		} catch (IOException e) {
			throw new RegistroException("Error al escribir en el archivo.");

		}

	}
}
