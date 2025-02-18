public class ProcesadorBiometrico {
    String algoritmoSegmentacion;
    String algoritmoAntiSpoofing;
    /*
    public void procesarHuella(Imagen){
        //En esta función habría codigo que se encargaría de procesar una huella
        // recibiendo una imagen de la misma y delvoviendo sus caracteristicas
        return Caracteristica;
    }*/

    public String getAlgoritmoSegmentacion() {
        return algoritmoSegmentacion;
    }

    public void setAlgoritmoSegmentacion(String algoritmoSegmentacion) {
        this.algoritmoSegmentacion = algoritmoSegmentacion;
    }

    public String getAlgoritmoAntiSpoofing() {
        return algoritmoAntiSpoofing;
    }

    public void setAlgoritmoAntiSpoofing(String algoritmoAntiSpoofing) {
        this.algoritmoAntiSpoofing = algoritmoAntiSpoofing;
    }
}
