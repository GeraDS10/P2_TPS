public class FiltroCanchaAlquilada extends Filtro{

    private Cancha canchaBuscada;

    public FiltroCanchaAlquilada(Cancha c1){
        this.canchaBuscada = c1;
    }
    @Override
    public boolean cumple(Socio s) {
        return s.alquiLasteCancha(this.canchaBuscada);
    }
}
