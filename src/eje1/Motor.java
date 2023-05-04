package eje1;

public abstract class Motor {

	protected String modelo;
	protected int    potencia;

	public Motor(String modelo, int potencia) {
		this.modelo   = modelo;
		this.potencia = potencia;

	}

	public abstract void acelerar();

	public abstract void arrancar();

	public abstract void apagar();

}
