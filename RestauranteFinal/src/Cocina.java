import java.util.ArrayList;

public class Cocina {

    private ArrayList<Estacion> estaciones;

    public Cocina(){
        estaciones = new ArrayList<Estacion>();
    }

    public void addEstacion (Estacion e){
        this.estaciones.add(e);
    }

    public void asignarPedido(Pedido p){
        for (Estacion e: estaciones
             ) {
            if(e.aceptasPedido(p)){
                break;
            }
        }
    }
}
