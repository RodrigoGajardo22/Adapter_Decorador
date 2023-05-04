package eje3;

public abstract class Combo implements Componente {

	private String descripcion;
	private int    precio;

	public Combo(String descripcion, int precio) {
		this.descripcion = descripcion;
		this.precio      = precio;
	}

	@Override
	public String descripcion() {

		return descripcion;
	}

	@Override
	public int precio() {

		return precio;
	}
}
