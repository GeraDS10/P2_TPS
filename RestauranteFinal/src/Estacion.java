import java.util.ArrayList;

public class Estacion {

private String nombre;
private ArrayList<Pedido> pedidosPendientes;
private Criterio criterio;

public Estacion(String nombre){
    this.nombre = nombre;
    this.pedidosPendientes = new ArrayList<Pedido>();
}

public String getNombre(){
    return this.nombre;
}

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public boolean aceptasPedido(Pedido p){
    if(this.criterio.cumple(p)){
        this.pedidosPendientes.add(p);
        return true;
    }
    else {
        return false;
    }
}
}
