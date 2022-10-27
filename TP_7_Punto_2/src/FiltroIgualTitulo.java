public class FiltroIgualTitulo extends Filtro{
    private String tituloBuscado;
    public FiltroIgualTitulo(String titulo){
        this.tituloBuscado = titulo;

    }
    @Override
    public boolean cumple(Documento d) {

        return d.getTitulo().equals(this.tituloBuscado);
    }
}
