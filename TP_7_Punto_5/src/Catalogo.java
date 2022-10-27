import java.util.ArrayList;

public class Catalogo {
    private String nombre;
    private ArrayList<Pelicula> peliculas;

    public Catalogo(String nombre){
        this.nombre = nombre;
        peliculas = new ArrayList<>();
    }

    public void addPelicula(Pelicula p){
        if(!peliculas.contains(p)){
            peliculas.add(p);
        }
    }

    public ArrayList<Pelicula> buscar(Filtro f){
        ArrayList<Pelicula> encontradas = new ArrayList<>();
        for (Pelicula p: this.peliculas
             ) {
            if(f.cumple(p)){
                encontradas.add(p);
            }
        }
        return encontradas;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "nombre='" + nombre + '\'' +
                ", peliculas=" + peliculas +
                '}';
    }
}
