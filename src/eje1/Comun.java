package eje1;

public class Comun extends Motor {

	public Comun(String modelo, int potencia) {
		super(modelo, potencia);
	}

	@Override
	public void acelerar() {
		System.out.println("Motor comun " + modelo);
		System.out.println("Acelerando");

	}

	@Override
	public void arrancar() {
		System.out.println("Motor comun " + modelo);
		System.out.println("Encendido");

	}

	@Override
	public void apagar() {
		System.out.println("Motor comun " + modelo);
		System.out.println("Apagando");

	}

}
