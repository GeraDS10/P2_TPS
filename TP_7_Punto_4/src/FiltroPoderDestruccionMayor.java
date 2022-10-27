public class FiltroPoderDestruccionMayor extends Filtro{

    private int poderMinimo;

    public FiltroPoderDestruccionMayor(int poderMinimo){
        this.poderMinimo = poderMinimo;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getPoderdestruccion()> this.poderMinimo;
    }
}
