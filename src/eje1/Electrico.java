package eje1;

public class Electrico {
	private String modelo;
	private int    potencia;

	public Electrico(String modelo, int potencia) {
		this.modelo   = modelo;
		this.potencia = potencia;
	}

	public void conectarYActivar() {
		System.out.println("Motor Electrico " + modelo);
		System.out.println("Conectar y Activar");
	}

	public void moverMasRapdio() {
		System.out.println("Motor Electrico " + modelo);
		System.out.println("Moviendo mas rapido");
		System.out.println("Potencia: " + potencia);
	}

	public void detenerYDesconecar() {
		System.out.println("Motor Electrico " + modelo);
		System.out.println("Desconectado");
	}

}
