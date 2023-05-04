package eje1;

public class Economico extends Motor {

	public Economico(String modelo, int potencia) {
		super(modelo, potencia);
	}

	@Override
	public void acelerar() {
		System.out.println("Motor Economico " + modelo);
		System.out.println("Acelerando");

	}

	@Override
	public void arrancar() {
		System.out.println("Motor Economico " + modelo);
		System.out.println("Encendido");

	}

	@Override
	public void apagar() {
		System.out.println("Motor Economico " + modelo);
		System.out.println("Apagando");

	}

}
