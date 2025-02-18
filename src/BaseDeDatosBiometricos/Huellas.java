public class Huella {
    private String idUsuario;
    private byte[] datosBiometricos;

    public Huella(String idUsuario, byte[] datosBiometricos) {
        this.idUsuario = idUsuario;
        this.datosBiometricos = datosBiometricos;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public byte[] getDatosBiometricos() {
        return datosBiometricos;
    }

    public void setDatosBiometricos(byte[] datosBiometricos) {
        this.datosBiometricos = datosBiometricos;
    }
}
