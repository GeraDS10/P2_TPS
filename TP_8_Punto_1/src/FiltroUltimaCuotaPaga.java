public class FiltroUltimaCuotaPaga extends Filtro{

    @Override
    public boolean cumple(Socio s) {
        if(s.isPagoUltimaCuota() == true){
            return true;
        }else {
            return false;
        }
    }
}
