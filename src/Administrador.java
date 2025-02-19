public class Administrador {
    

    private String id;
    private String nombre;

   
    public Administrador(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    
    public void agregarUsuario(Usuario usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " agregado por el administrador " + nombre);
    }

    
    public void eliminarUsuario(Usuario usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " eliminado por el administrador " + nombre);
    }

    public void gestionarHuellas() {
        System.out.println("Gestionando huellas dactilares...");
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
