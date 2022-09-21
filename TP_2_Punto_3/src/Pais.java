import java.util.ArrayList;

public class Pais {

    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre){
        this.nombre = nombre;
        ArrayList<Provincia> provincias = new ArrayList<Provincia>();
    }

    public void addProvincia(Provincia p){
        if(!provincias.contains(p)){
            provincias.add(p);
        }else {
            System.out.println("La provincia ya se encuentra agregada");
        }
    }

    public void deleteProvincia(Provincia p){
        if(!provincias.contains(p)){
            provincias.remove(p);
        }else{
            System.out.println("No se encuentra la provincia a borrar");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return new ArrayList<>(provincias);
    }

    public ArrayList<Ciudad> getCiudadesDeficit(){
        ArrayList<Ciudad> ciudadesDeficit = new ArrayList<>();
        for (Provincia p: provincias
             ) {
            for (Ciudad c: p.getCiudadesConDeficit()
                 ) {
                ciudadesDeficit.add(c);
            }
        }
        return ciudadesDeficit;
    }

    public ArrayList<Provincia> getProvinciasDeficit(){
        ArrayList<Provincia> provinciasDeficit = new ArrayList<>();
        for (Provincia p: provincias
             ) {if (p.getCiudadesConDeficit().size() > p.getCiudades().size()/2){
                 provincias.add(p);
        }
        }
        return provinciasDeficit;
    }
}
