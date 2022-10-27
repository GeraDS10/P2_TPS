import java.util.Locale;

public class FiltroContieneEnTitulo extends Filtro{

    private String contiene;

    public FiltroContieneEnTitulo(String contiene){
        this.contiene = contiene;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getTitulo().toLowerCase().contains(this.contiene.toLowerCase());
    }
}
