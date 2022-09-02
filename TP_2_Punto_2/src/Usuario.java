public class Usuario {

    private String nombre;
    private int telefono;
    private String email;
    private boolean esAsistente;

    //Constructor

    public Usuario(String nombre, int telefono, String email, boolean esAsistente) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.esAsistente = esAsistente;
    }

    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEsAsistente() {
        return esAsistente;
    }

    public void setEsAsistente(boolean esAsistente) {
        this.esAsistente = esAsistente;
    }
}
