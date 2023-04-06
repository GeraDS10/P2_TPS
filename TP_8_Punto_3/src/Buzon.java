import java.util.ArrayList;

public class Buzon {

    private String barrio;
    private String localidad;
    private String provincia;
    private String pais;
    private ArrayList<Ninio> niniosBuenos;
    private ArrayList<Carta> cartas;

    private String regaloNinioMalo = "Pedazo de Carbon";

    public Buzon(String barrio, String localidad, String provincia, String pais) {
        this.barrio = barrio;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
        this.niniosBuenos = new ArrayList<>();
        this.cartas = new ArrayList<>();
    }

    public Buzon(){

    }

    public String getBarrio() {
        return this.barrio;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public String getPais() {
        return this.pais;
    }

    public void addNinioBueno(Ninio n){
        this.niniosBuenos.add(n);
    }

    public boolean esNinioBueno(Ninio n){
        return this.niniosBuenos.contains(n);
    }

    public void setRegaloNinioMalo(String regaloNinioMalo) {
        this.regaloNinioMalo = regaloNinioMalo;
    }

    public boolean remitenteRepetido(Carta nueva){
        for (Carta c: this.cartas
             ) {
            if (c.getRemitente().equals(nueva.getRemitente())){
                return true;
            }
        }
        return false;
    }

    public void addCarta(Carta c){
        if(!this.remitenteRepetido(c)){
            if (this.esNinioBueno(c.getRemitente())){
                this.cartas.add(c);
            }else {
                c.deleteRegalosSolicitados();
                c.addRegalo(this.regaloNinioMalo);
                this.cartas.add(c);
            }
        }
    }

    public int getCantidadCartas(){
        return this.cartas.size();
    }

    public ArrayList<Carta> buscar(Filtro filtro){
        ArrayList<Carta> encontradas = new ArrayList<>();
        for (Carta c: cartas
             ) {
            if (filtro.cumple(c)){
                encontradas.add(c);
            }
        }
        return encontradas;
    }
}
