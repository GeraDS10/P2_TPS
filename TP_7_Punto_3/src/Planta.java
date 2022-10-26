import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String familia;
    private int riego;
    private int sol;

    public Planta(String nombre, String familia, int riego, int sol){
        this.nombreCientifico = nombre;
        this. familia = familia;
        this.riego = riego;
        this.sol = sol;
        nombresVulgares = new ArrayList<>();
    }

    public void addNombreVulgar(String nombre){
        nombresVulgares.add(nombre);
    }
    public String getNombreCientifico(){
        return this.nombreCientifico;
    }
    public int getRiego(){
        return this.riego;
    }
    public int getSol(){
        return this.sol;
    }
    public String getFamilia(){
        return this.familia;
    }

    public boolean contieneNombreVulgar(String nombre){
        return this.nombresVulgares.contains(nombre);
    }

    @Override
    public boolean equals(Object o) {
        try {
            Planta otra = (Planta) o;
            return this.getNombreCientifico().equals(otra.getNombreCientifico());
        }catch (Exception e){
            return false;
        }
    }
}
