public class FichaEspecial extends Ficha{

    public FichaEspecial(String nombre, int fortaleza, int cantidadCasilleros){
        super(nombre, fortaleza, cantidadCasilleros);
    }

    @Override
    public int getPoderdestruccion() {
        return this.getFortaleza()/this.getCantidadCasilleros();
    }
}
