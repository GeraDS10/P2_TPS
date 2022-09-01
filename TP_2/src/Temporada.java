import java.util.ArrayList;

public class Temporada {
    ArrayList<Episodio> episodios;

public Temporada(){

}

//Funcionalidaes
    public void agregarEpisodio(Episodio e){
        episodios.add(e);
    }

    public int cantidadEpisodiosVistos(){
    int vistos = 0;
        for (Episodio e: episodios
             ) {
            if(e.fueVisto()){
                vistos++;
            }
        }
        return vistos;
    }

    public double CalificacionfPromedioTemporada(){
        double total = 0;
        double cantidad = 0;
        for (Episodio e: episodios
             ) {
            if (e.getCalificacion() >= 1) {
                total += e.getCalificacion();
                cantidad++;
            }
        }
        double promedio = total / cantidad;
        return promedio;
    }

    public int cantidadCapitulosVistos(){
    int cantidad = 0;
        for (Episodio e: episodios
             ) {
            if(e.fueVisto()){
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cantidadCapitulos(){
        return episodios.size();
    }
}


