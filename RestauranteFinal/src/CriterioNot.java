public class CriterioNot extends Criterio{

    private Criterio criterio;

    public CriterioNot(Criterio c){
        this.criterio = c;
    }

    @Override
    public boolean cumple(Pedido p) {
        return !this.criterio.cumple(p);
    }
}
