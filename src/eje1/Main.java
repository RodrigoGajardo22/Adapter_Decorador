package eje1;

public class Main {

	public static void main(String[] args) {
		Motor economico = new Economico("Fiat Uno 1.3", 68);
		Motor comun     = new Comun("VW Bora 1.8", 180);
		Motor electrico = new AdapterElectrico("Tesla Model 3", 283);

		economico.arrancar();
		economico.acelerar();
		economico.apagar();

		electrico.arrancar();
		electrico.acelerar();
		electrico.apagar();
	}

}
