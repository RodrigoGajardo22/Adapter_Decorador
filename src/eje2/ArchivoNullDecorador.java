package eje2;

import java.io.File;

public class ArchivoNullDecorador implements Componente {

	private Componente componente;

	public ArchivoNullDecorador(Componente componente) {
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
