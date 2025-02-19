import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private List<Huella> huellasRegistradas;

    public BaseDatos() {
        this.huellasRegistradas = new ArrayList<>();
    }

    public boolean buscarHuella(Huella huella) {
        for (Huella h : huellasRegistradas) {
            if (h.getIdUsuario().equals(huella.getIdUsuario())) {
                return true; // Huella encontrada
            }
        }
        return false;
    }

    public void almacenarHuella(Huella huella) {
        if (!buscarHuella(huella)) {
            huellasRegistradas.add(huella);
            System.out.println("Huella almacenada correctamente.");
        } else {
            System.out.println("La huella ya está registrada.");
        }
    }

    public List<Huella> getHuellasRegistradas() {
        return huellasRegistradas;
    }
}
