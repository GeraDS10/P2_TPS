public class Electrodomestico {
    String nombre;
    double precioBase = 100;
    String color = "Gris Plata";
    int consumoEnergetico = 10;
    double peso = 2;

    //Inicio Constructores

    public Electrodomestico(String nombre){
        this.nombre = nombre;
    }
    public Electrodomestico(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public Electrodomestico(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    public Electrodomestico(String nombre, int consumoEnergetico){
        this.nombre = nombre;
        this.consumoEnergetico = consumoEnergetico;
    }
    public Electrodomestico(String nombre,double precioBase, String color, int consumoEnergetico, double peso){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //Fin Constructores

    // Inicio Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Fin Getters y Setters

    // Funcionalidades
    public boolean esBajoConsumo(){
        if(this.consumoEnergetico < 45){
            return true;
        } else {
            return false;
        }
    }

    public double getBalance (){
        return this.precioBase / this.peso;
    }

    public boolean esAltaGama(){
        if (getBalance() > 3){
            return true;
        } else{
            return false;
        }

    }


}
