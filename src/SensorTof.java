public class SensorToF {

    private double distancia;
    private double inclinacion;


    public SensorToF(double distancia, double inclinacion) {
        this.distancia = distancia;
        this.inclinacion = inclinacion;
    }

    
    public double medirDistancia() {
        System.out.println("Midiendo distancia con el sensor ToF...");
        return this.distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getInclinacion() {
        return inclinacion;
    }

    public void setInclinacion(double inclinacion) {
        this.inclinacion = inclinacion;
    }

    @Override
    public String toString() {
        return "SensorToF {" +
                "distancia=" + distancia +
                ", inclinacion=" + inclinacion +
                '}';
    }
}
