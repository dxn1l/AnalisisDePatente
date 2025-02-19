public class SistemaBiometrico {
	private BaseDeDatos baseDatosHuella;
	private ModuloCaptura moduloCaptura;
	private ModuloLuz moduloIluminacion;
	private ProcesadorBiometrico procesadorBiometrico;

	private Huella capturarHuella() {
		moduloIluminacion.activarIluminacion();
		Imagen imagen = moduloCaptura.capturarImagen();
		return procesadorBiometrico.procesarHuella(imagen);
	}

	public boolean autenticarHuella() {
		return baseDatosHuella.buscarHuella(this.capturarHuella());
	}

	public void registrarHuella() {
		baseDatosHuella.almacenarHuella(this.capturarHuella());
	}
}
