public class FiltroOr extends Filtro{
    private Filtro f1, f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Pelicula p) {
        if(f1.cumple(p) || f2.cumple(p)){
            return true;
        }else {
            return false;
        }
    }
}
