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

    public boolean tieneEstadoPatologico(String patologia){

        return this.estadosPatologicos.contains(patologia);
    }


}


