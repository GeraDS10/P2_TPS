public class FiltroGenero extends Filtro{
    private String generoBuscado;

    public FiltroGenero(String generoBuscado){
        this.generoBuscado = generoBuscado;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.contieneGenero(this.generoBuscado);
    }
}
