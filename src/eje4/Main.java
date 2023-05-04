package eje4;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		RestCall restCall = new RestCall("https://jsonplaceholder.typicode.com/posts");
		System.out.println(restCall.run());

		String     ruta      = "C:\\Users\\Usuario\\Documents\\2 - UNIVERSIDAD RODRI\\Orientacion a Objetos 2\\Persistencia\\RestCall.txt";

		File       archivo   = new File(ruta);

		Componente decorador = new EnBaseDecorador(restCall);

		decorador.run();

	}

}
