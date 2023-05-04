package eje4;

import java.io.File;
import java.io.FileWriter;

public class EnArchivoDecorador implements Componente {

	private File       file;
	private Componente decorado;

	public EnArchivoDecorador(File file, Componente decorado) {
		this.file     = file;
		this.decorado = decorado;
	}

	@Override
	public String run() {

		registrar(decorado.run());

		return null;
	}

	private void registrar(String datos) {

		try {

			FileWriter escribir = new FileWriter(file, true);

			escribir.write(datos);
			escribir.write("\r\n");
			escribir.close();
		} // Si existe un problema al escribir cae aqui
		catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
