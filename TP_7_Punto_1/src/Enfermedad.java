import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList <String> estadosPatologicos;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addEstadoPatologico(String nuevo){

        this.estadosPatologicos.add(nuevo);
    }

    public boolean puedeTratarte(Agroquimico a){
        for (String patologia: this.estadosPatologicos
             ) {
            if(!a.trataEstadoPatologico(patologia)){
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        return this.getNombre();
    }



}


