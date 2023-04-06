public class FiltroPagaronMasDe extends Filtro{

    private int precioBase;

    public FiltroPagaronMasDe(int precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public boolean cumple(Socio s) {
        return s.pagasteAlquilerMasDe(this.precioBase);
    }
}
