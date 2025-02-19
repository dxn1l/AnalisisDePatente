public class LED{
    private boolean encendido;

    public LED(){
        this.encendido=false;
    }

    public void encender(){
        this.encendido=true;
    }

    public void apagar(){
        this.encendido=false;
    }

    public boolean isEncendido() {
        return encendido;
    }
}