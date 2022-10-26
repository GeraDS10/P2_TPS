import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenidoTextual;
    private ArrayList palabrasClaves;

    public Documento(String titulo){
        this.titulo = titulo;
        autores = new ArrayList<>();
        palabrasClaves = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Documento otro = (Documento) o;
            return this.getTitulo().equals(otro.getTitulo());
        }catch (Exception e){
            return false;
        }
    }
}
