public class FiltroNot extends Filtro{
    private Filtro aNegar;

    public FiltroNot(Filtro aNegar){
        this.aNegar = aNegar;
    }

    @Override
    public boolean cumple(Pelicula p) {
        if (aNegar.cumple(p)){
            return false;
        }else{
            return true;
        }
    }
}
