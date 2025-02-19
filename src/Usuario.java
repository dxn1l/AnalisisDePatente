public class Usuario{
    private String id;
    private String nombre;
    private String credenciales;

    public Usuario(String id, String nombre, String credenciales) {
        this.id = id;
        this.nombre = nombre;
        this.credenciales = credenciales;
    }

    public boolean solicitarCredenciales(){
        //Logica de autentificacion
        //Utilizando clase de SistemaBiometrico
        return credenciales != null && !credenciales.isEmpty();
    }

    //Getters y setters

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

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
}