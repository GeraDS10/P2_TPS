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
        if(!agroquimico.cultivoDesaconsejado(this)){
            for (Enfermedad e:this.enfermedadesFrecuentes
                 ) {
                if(!e.puedeTratarte(agroquimico)){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        try{
            Cultivo otro = (Cultivo) o;
            return this.getNombre().equals(otro.getNombre());

        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
