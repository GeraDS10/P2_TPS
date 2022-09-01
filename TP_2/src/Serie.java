import java.util.ArrayList;

public class Serie {
    String titulo;
    String descripcion;
    String creador;
    String genero;
    ArrayList<Temporada> temporadas;

    //Constructor

    public Serie(){

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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Funcionalidades

    public void agregarTemporada(Temporada t){
        temporadas.add(t);
    }

    public int capitulosVistos(){
        int capVistos = 0;
        for (Temporada t: temporadas
             ) {
            capVistos += t.cantidadEpisodiosVistos();
        }
        return capVistos;
    }

    public double calificacionPromedioTemporada(){
        double total = 0;
        double cantidad = 0;
        for (Temporada t: temporadas
             ) {
            if(t.CalificacionfPromedioTemporada() > 0){
                total += t.CalificacionfPromedioTemporada();
                cantidad ++;
            }
        }
        double promedio = total/ cantidad;
        return promedio;
    }

    public boolean todosVistos(){
        for (Temporada t: temporadas
             ) {
            if((t.cantidadCapitulos() == t.cantidadCapitulosVistos())&&(t.cantidadCapitulos() > 0)){

            }else {
                return false;
            }
        }
        return true;
    }


}
