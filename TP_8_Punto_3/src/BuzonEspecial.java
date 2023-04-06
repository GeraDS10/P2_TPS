import java.util.ArrayList;

public class BuzonEspecial extends Buzon{

    private String localidad;
    private String provincia;
    private String pais;
    private ArrayList<Carta> cartas;
    private ArrayList<Ninio> niniosBuenos;
    public BuzonEspecial(){
        this.localidad = null;
        this.provincia = null;
        this.pais = null;
        cartas = new ArrayList<>();
        niniosBuenos = new ArrayList<>();
    }

    @Override
    public String getLocalidad() {
        return localidad;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public String getPais() {
        return pais;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
