public class SensorCMOS {

    private String resolucion;

    //Contructor
    public SensorCMOS(String resolucion) {
        this.resolucion = resolucion;
    }


    // Se obtiene la imagen del sensor CMOS
    // public Imagen obtenerImagen(){
    // return new Imagen();
    // }

    //Getters y Setters
    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
