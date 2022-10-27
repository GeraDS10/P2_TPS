public class FiltroNombreVulgar extends Filtro{
    private String nombreBuscado;

    public FiltroNombreVulgar(String nombreBuscado){
        this.nombreBuscado = nombreBuscado;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.contieneNombreVulgar(this.nombreBuscado);
    }
}
