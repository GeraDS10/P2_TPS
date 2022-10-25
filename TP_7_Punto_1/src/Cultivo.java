import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedadesFrecuentes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }
    public void addEnfermedadFrecuente(Enfermedad e){
        this.enfermedadesFrecuentes.add(e);
    }

    public ArrayList<Enfermedad> getEnfermedadesFrecuentes() {
        return new ArrayList(enfermedadesFrecuentes);
    }

    public boolean puedeServir(Agroquimico agroquimico){
        for (Enfermedad e: enfermedadesFrecuentes
             ) {
            agroquimico.trataPatologia()
        }
    }
}
