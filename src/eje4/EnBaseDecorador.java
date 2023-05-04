package eje4;

import com.google.gson.Gson;

public class EnBaseDecorador implements Componente {

	private Componente componente;
	private MiDataBase miDB;

	public EnBaseDecorador(Componente componente) {

		this.componente = componente;
		this.miDB       = new MiDataBase();
	}

	@Override
	public String run() {

		Gson     gson    = new Gson();
		Posteo[] posteos = gson.fromJson(componente.run(), Posteo[].class);

		for (Posteo posteo : posteos) {
			String datos = obtenerDatos(posteo);
			miDB.registrar(datos);
		}

		return null;
	}

	private String obtenerDatos(Posteo p) {

		return p.userId() + "," + p.id() + "," + p.title() + "," + p.body();
	}

}
