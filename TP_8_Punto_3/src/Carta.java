import java.util.ArrayList;

public class Carta {

    private Ninio remitente;
    private ArrayList<String> regalosSolicitados;

    public Carta(Ninio remitente) {
        this.remitente = remitente;
        regalosSolicitados = new ArrayList<>();

    }

    public Ninio getRemitente(){
     return this.remitente;
    }

    public void addRegalo(String regaloNuevo){
        regalosSolicitados.add(regaloNuevo);
    }

    public void deleteRegalosSolicitados(){
        this.regalosSolicitados.clear();
    }

    public boolean contieneRegalo(String regaloBuscado){
        return this.regalosSolicitados.contains(regaloBuscado);
    }

}
