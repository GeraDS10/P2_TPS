import java.util.ArrayList;
import java.util.Objects;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private int anioEstreno;
    private int duracion;
    private int edadMinima;

    public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public void addGenero(String genero){
        generos.add(genero);
    }

    public boolean contieneGenero(String generoBuscado){
        return generos.contains(generoBuscado);
    }

    public String getTitulo(){
        return this.titulo;
    }

    @Override
    public boolean equals(Object o) {
        try{
            Pelicula otra = (Pelicula) o;
            return this.getTitulo().equals(otra.getTitulo());
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
