package eje1;

public class AdapterElectrico extends Motor {
	private Electrico electrico;

	public AdapterElectrico(String modelo, int potencia) {
		super(modelo, potencia);
		electrico = new Electrico(modelo, potencia); // Debe recibirlo por constrcutor
	}

	@Override
	public void acelerar() {
		electrico.moverMasRapdio();
	}

	@Override
	public void arrancar() {
		electrico.conectarYActivar();
	}

	@Override
	public void apagar() {
		electrico.detenerYDesconecar();
	}

}
