import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosDesaconsejados;
    private ArrayList<String> estadosPatologicosTratados;

    public Agroquimico(String nombre){
        this.nombre = nombre;
        this.cultivosDesaconsejados = new ArrayList<>();
        this.estadosPatologicosTratados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getCultivosDesaconsejados() {
        return new ArrayList(cultivosDesaconsejados);
    }

    public ArrayList<String> getEstadosPatologicosTratados() {
        return new ArrayList(estadosPatologicosTratados);
    }

    public boolean trataEstadoPatologico(String patologia){
        return this.estadosPatologicosTratados.contains(patologia);
    }

    public boolean cultivoDesaconsejado(Cultivo otro){
        for (Cultivo c: this.cultivosDesaconsejados
             ) {
            if(c.equals(otro)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return this.getNombre();
    }
}
