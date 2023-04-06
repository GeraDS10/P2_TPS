public class FiltroApellido extends Filtro{

    private String apellidoBuscado;

    public FiltroApellido(String apellidoBuscado) {
        this.apellidoBuscado = apellidoBuscado;
    }

    @Override
    public boolean cumple(Socio s) {
        return s.getApellido().contains(this.apellidoBuscado);
    }
}
