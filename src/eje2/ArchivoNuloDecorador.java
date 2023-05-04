package eje2;

import java.io.File;

public class ArchivoNuloDecorador implements Componente {

	private Componente componente;

	public ArchivoNuloDecorador(Componente componente) {
		this.componente = componente;
	}

	@Override
	public void export(File file) {

		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}
		componente.export(file);
	}

}
