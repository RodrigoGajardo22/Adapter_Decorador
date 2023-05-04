package eje3;

public class Main {

	public static void main(String[] args) {

		Componente basico     = new Basico("Basico", 20);        // Decorado
		Componente conTomate  = new Tomate("Tomate", 5, basico);
		Componente extraPapas = new Papa("Papas", 10, conTomate);

		Componente especial   = new Especial("Especial", 35);    // Decorado
		Componente queso      = new Queso("Queso", 15, especial);
		Componente carne      = new Carne("Carne", 20, queso);
		Componente tomate     = new Tomate("Tomate", 5, carne);
		Componente papas      = new Papa("Papas", 10, tomate);

		System.out.println("Combo 1: " + extraPapas.descripcion());
		System.out.println("Precio: " + extraPapas.precio());

		System.out.println("Combo 3: " + papas.descripcion());
		System.out.println("Precio: " + papas.precio());

	}

}
