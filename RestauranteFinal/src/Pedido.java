import java.util.ArrayList;

public class Pedido {

    private ArrayList<Comida> comidas;
    private int numeroMesa;
    private String nombreMozo;
    private Adicional adicional;

    public Pedido(int numeroMesa, String nombreMozo) {
        this.numeroMesa = numeroMesa;
        this.nombreMozo = nombreMozo;
        comidas = new ArrayList<Comida>();
    }

    public void setAdicional(Adicional a){
        this.adicional = a;
    }

    public void addComida(Comida c){
        comidas.add(c);
    }

    public ArrayList<Comida> getComidas() {
        return new ArrayList<>(this.comidas);
    }
}
