public class FiltroRegalo extends Filtro{

    private String regaloBuscado;

    public FiltroRegalo(String regaloBuscado) {
        this.regaloBuscado = regaloBuscado;
    }

    @Override
    public boolean cumple(Carta c) {
        return c.contieneRegalo(regaloBuscado);
    }
}
