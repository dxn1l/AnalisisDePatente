import java.util.List;

public class ModuloLuz{
    private List<LED> listaLeds;

    public ModuloLuz(List<LED> listaLeds) {
        this.listaLeds = listaLeds;
    }

    public List<LED> getListaLeds() {
        return listaLeds;
    }

    public void setListaLeds(List<LED> listaLeds) {
        this.listaLeds = listaLeds;
    }

    public void activarIluminacion(){
        for (LED led : listaLeds) {
            led.encender();
        }
    }
}