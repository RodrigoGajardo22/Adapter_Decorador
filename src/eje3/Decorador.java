package eje3;

public abstract class Decorador implements Componente {

	private String     descripcion;
	private int        precio;
	private Componente componente;

	public Decorador(String descripcion, int precio, Componente componente) {
		this.descripcion = descripcion;
		this.precio      = precio;
		this.componente  = componente;

	}

	public String descripcion() {
		return componente.descripcion() + " + " + descripcion;
	}

	public int precio() {
		return precio + componente.precio();
	}

}
