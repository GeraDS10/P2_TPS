public class FiltroNombre extends Filtro{

    private String nombreBuscado;

    public FiltroNombre(String nombreBuscado) {
        this.nombreBuscado = nombreBuscado;
    }

    public boolean cumple(Socio s){
        return s.getNombre().contains(this.nombreBuscado);
    }
}
