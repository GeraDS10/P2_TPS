import java.util.ArrayList;

public class Provincia {

    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre){
        this.nombre = nombre;
    }

    public void addCiudad(Ciudad c){
        if(!ciudades.contains(c)){
            ciudades.add(c);
        }else {
            System.out.println("La ciudad ya se encuentra en la Provincia");
        }
    }

    public ArrayList<Ciudad> getCiudades(){
        return new ArrayList<>(ciudades);
    }

    public ArrayList<Ciudad> getCiudadesConDeficit(){
        ArrayList<Ciudad> conDeficit = new ArrayList<>();
        for (Ciudad c: ciudades
             ) {if(c.tieneDeficit()){
                 conDeficit.add(c);
                }
        }
        return conDeficit;
    }

    public boolean mayoriaConDeficit(){
        if(getCiudadesConDeficit().size() > getCiudades().size()){
            return true;
        }else {
            return false;
        }
    }
}
