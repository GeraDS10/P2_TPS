public class FiltroUltimaCuotaImpaga extends Filtro{

    @Override
    public boolean cumple(Socio s) {
        if(s.isPagoUltimaCuota() == false){
            return true;
        }else {
            return false;
        }
    }
}
