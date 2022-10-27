import java.util.ArrayList;

public class Club {
    private String nombre;
    private ArrayList<Cancha> canchas;
    private ArrayList<Socio> socios;

    public Club(String nombre) {
        this.nombre = nombre;
        canchas = new ArrayList<>();
        socios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addCancha (Cancha c){
        if(!canchas.contains(c)){
            this.canchas.add(c);
        }
    }

    public void addSocio(Socio s){
        if(!socios.contains(s)){
            socios.add(s);
        }
    }

    public ArrayList<Socio> buscar(Filtro f){
        ArrayList<Socio> encontrados = new ArrayList<>();
        for (Socio s: this.socios
             ) {
            if (f.cumple(s)){
                encontrados.add(s);
            }
        }
        return encontrados;
    }
}
