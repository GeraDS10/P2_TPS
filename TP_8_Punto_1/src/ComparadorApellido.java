import java.util.Comparator;

public class ComparadorApellido implements Comparator<Socio> {

    public int compare(Socio s1, Socio s2){
        return s1.getApellido().compareTo(s2.getApellido());
    }
}
