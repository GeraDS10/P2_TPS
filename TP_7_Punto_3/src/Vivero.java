import java.util.ArrayList;

public class Vivero {
    private String nombre;
    private ArrayList<Planta> plantas;

    public Vivero(String nombre){
        this.nombre = nombre;
        plantas = new ArrayList<Planta>();
    }
    public ArrayList<Planta> buscar(Filtro filtro){
        ArrayList<Planta> encontradas =new ArrayList<Planta>();
        for (Planta p: plantas
             ) {
            if(filtro.cumple(p)){
                encontradas.add(p);
            }
        }
        return encontradas;
    }
}
