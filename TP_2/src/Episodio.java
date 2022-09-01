public class Episodio {
    String titulo;
    String descripcion;
    boolean visto = false;
    int calificacion = -1;

    //Constructor

    public Episodio(String titulo, String descripcion){

    }

    //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }


    //Funcionalidades

    public void calificar(int puntaje){
        if((puntaje >= 1) &&(puntaje <= 5)){
            this.calificacion = puntaje;
        }else {
            System.out.println("Valor incorrecto");
        }
    }

    public boolean fueVisto(){
        return visto;
    }

}
