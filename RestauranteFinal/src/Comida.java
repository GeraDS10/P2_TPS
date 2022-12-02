public abstract class Comida {
     String nombre;
     String tipo;
     String modoPreparacion;
     int calorias;
     int precio;
     int tiempoPreparacion;
     Adicional adicional;

    public Comida(String nombre, String tipo, String modoPreparacion, int calorias, int precio, int tiempoPreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
        this.calorias = calorias;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public Comida(String nombre){
        this.nombre = nombre;
    }

    public abstract int getCalorias();

    public abstract int getTiempoPreparacion();

    public abstract int getPrecio();
}
