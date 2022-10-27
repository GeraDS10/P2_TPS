public class Ficha {
    private String nombre;
    private int fortaleza;
    private int cantidadCasilleros;
    private int poderdestruccion;

    public Ficha(String nombre, int fortaleza, int cantidadCasilleros, int poderdestruccion){
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.cantidadCasilleros = cantidadCasilleros;
        this.poderdestruccion = poderdestruccion;
    }

    public Ficha(String nombre, int fortaleza, int cantidadCasilleros){
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.cantidadCasilleros = cantidadCasilleros;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getCantidadCasilleros() {
        return cantidadCasilleros;
    }

    public int getPoderdestruccion() {
        return poderdestruccion;
    }

    public boolean equals(Object o){
        try{
            Ficha otra = (Ficha) o;
            return this.getNombre().equals(otra.getNombre());
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ficha{" + nombre + '\'' +
                '}';
    }
}

