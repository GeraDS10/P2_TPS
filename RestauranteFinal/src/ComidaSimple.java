public class ComidaSimple extends Comida{

    public ComidaSimple(String nombre, String tipo, String modoPreparacion, int calorias, int precio, int tiempoPreparacion){
        super(nombre, tipo, modoPreparacion, calorias, precio, tiempoPreparacion);
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }


    @Override
    public int getCalorias() {
        return this.calorias;
    }

    @Override
    public int getTiempoPreparacion() {
        return this.tiempoPreparacion;
    }

    @Override
    public int getPrecio() {
        return this.precio + this.adicional.getAdicional(this);
    }
}
