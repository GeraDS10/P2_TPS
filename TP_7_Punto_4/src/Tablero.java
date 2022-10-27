import java.util.ArrayList;

public class Tablero {

    private String nombre;
    private ArrayList<Ficha> fichas;
    private int puntajeMinimo;
    private int dificultad;

    public Tablero(String nombre, int puntajeMinimo){
        this.nombre = nombre;
        this.puntajeMinimo = puntajeMinimo;
        fichas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public double getDificultad(){
        int dificultad = 0;
        int sumatoriaFortaleza = 0;
        int sumatoriaPoderDestruccion = 0;
        for (Ficha f: fichas
             ) {
            sumatoriaFortaleza += f.getFortaleza();
            sumatoriaPoderDestruccion += f.getPoderdestruccion();
        }
        return dificultad = sumatoriaFortaleza / sumatoriaPoderDestruccion;
    }

    public void addFichas(Ficha f){
        if(!fichas.contains(f)){
            this.fichas.add(f);
        }
    }

    public ArrayList<Ficha> getFichas(){
        return new ArrayList<>(this.fichas);
    }

    public ArrayList<Ficha> buscar(Filtro fil){
        ArrayList<Ficha> encontradas = new ArrayList<>();
        for (Ficha f: fichas
             ) {
            if(fil.cumple(f)){
                encontradas.add(f);
            }
        }
        return encontradas;
    }

    @Override
    public String toString() {
        return "Tablero{" +
                "nombre='" + nombre + '\'' +
                ", fichas=" + fichas +
                '}';
    }
}
