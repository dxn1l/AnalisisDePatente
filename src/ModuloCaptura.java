public class ModuloCaptura {

    private SensorCMOS sensorCMOS;
    private SensorToF sensorToF;

    public ModuloCaptura(SensorCMOS sensorCMOS, SensorToF sensorToF) {
        this.sensorCMOS = sensorCMOS;
        this.sensorToF = sensorToF;
    }

    public Imagen capturarImagen() {
        System.out.println("Capturando imagen usando sensor CMOS y sensor ToF...");
        return new Imagen(sensorCMOS.obtenerDatos(), sensorToF.obtenerProfundidad());
    }

    public SensorCMOS getSensorCMOS() {
        return sensorCMOS;
    }

    public void setSensorCMOS(SensorCMOS sensorCMOS) {
        this.sensorCMOS = sensorCMOS;
    }

    public SensorToF getSensorToF() {
        return sensorToF;
    }

    public void setSensorToF(SensorToF sensorToF) {
        this.sensorToF = sensorToF;
    }
} 

class SensorCMOS {
    public String obtenerDatos() {
        return "Datos de imagen RGB";
    }
}

class SensorToF {
    public String obtenerProfundidad() {
        return "Datos de profundidad";
    }
}

class Imagen {
    private String datosRGB;
    private String datosProfundidad;

    public Imagen(String datosRGB, String datosProfundidad) {
        this.datosRGB = datosRGB;
        this.datosProfundidad = datosProfundidad;
    }

    @Override
    public String toString() {
        return "Imagen {" +
                "RGB='" + datosRGB + '\'' +
                ", Profundidad='" + datosProfundidad + '\'' +
                '}';
    }
} 
