package eje2;

import java.io.File;

public class YaExisteDecorador implements Componente {

	private Componente componente;

	public YaExisteDecorador(Componente componente) {
		this.componente = componente;

	}

	@Override
	public void export(File file) {

		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		componente.export(file);
	}

}
