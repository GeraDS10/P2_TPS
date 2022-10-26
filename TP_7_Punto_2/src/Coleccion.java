import javax.print.Doc;
import java.util.ArrayList;

public class Coleccion {
    private String nombre;
    private ArrayList<Documento> documentos;
    private Filtro filtro;

    public Coleccion(String nombre){
        this.nombre = nombre;
        documentos = new ArrayList<Documento>();

    }

    public ArrayList<Documento> buscar(Filtro filtro){
        ArrayList<Documento> encontrados = new ArrayList<Documento>();
        for (Documento d: documentos
             ) {
            if (filtro.cumple(d)){
                encontrados.add(d);
            }
        }
        return encontrados;
    }
}
