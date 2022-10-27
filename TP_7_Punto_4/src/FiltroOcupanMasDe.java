public class FiltroOcupanMasDe extends Filtro{

    private int minimoCasilleros;

    public FiltroOcupanMasDe(int minimoCasilleros){
        this.minimoCasilleros = minimoCasilleros;
    }

    @Override
    public boolean cumple(Ficha f) {
        if(f.getCantidadCasilleros() > minimoCasilleros){
            return true;
        }else {
            return false;
        }
    }
}
