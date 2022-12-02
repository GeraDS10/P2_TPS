import java.util.ArrayList;

public class ComidaCompleja extends Comida{

    private ArrayList<Comida> ingredientes;

    public ComidaCompleja(String nombre) {
        super(nombre);
        ingredientes = new ArrayList<Comida>();
    }


    @Override
    public int getCalorias() {
        int caloriasTotal = 0;
        for (Comida c: ingredientes
             ) {
            caloriasTotal += c.getCalorias();
        }
        return caloriasTotal;
    }

    @Override
    public int getTiempoPreparacion() {
        int tiempoTotal = 0;
        for (Comida c: ingredientes
             ) {
            tiempoTotal += c.getTiempoPreparacion();
        }
        return tiempoTotal;
    }

    @Override
    public int getPrecio() {
        int precioTotal = 0;
        for (Comida c: ingredientes
             ) {
            precioTotal += c.getPrecio();
        }
        return precioTotal;
    }
}
