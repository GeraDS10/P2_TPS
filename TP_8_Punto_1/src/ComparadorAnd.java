import java.util.Comparator;

public class ComparadorAnd implements Comparator<Socio> {

    private Comparator<Socio> cs1;
    private Comparator<Socio> cs2;

    public ComparadorAnd(Comparator<Socio> cs1, Comparator<Socio> cs2){
        this.cs1 = cs1;
        this.cs2 = cs2;

    }

    @Override
    public int compare(Socio s1, Socio s2) {
        int resultado= this.cs1.compare(s1,s2);
        if(resultado == 0){
            resultado = this.cs2.compare(s1,s2);
        }
        return resultado;
    }
}
