public class CriterioAnd extends Criterio{

    private Criterio c1, c2;

    public CriterioAnd(Criterio c1, Criterio c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Pedido p) {
        if((this.c1.cumple(p))&&(this.c2.cumple(p))){
            return true;
        }
        else {
            return false;
        }
    }
}
