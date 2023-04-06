public class FiltroEdadMenor extends Filtro{

    private int edadLimite;

    public FiltroEdadMenor(int edadLimite) {
        this.edadLimite = edadLimite;
    }

    @Override
    public boolean cumple(Socio s) {
        return s.getEdad() < this.edadLimite;
    }
}
