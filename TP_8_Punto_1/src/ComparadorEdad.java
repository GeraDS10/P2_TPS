import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        if(s1.getEdad() > s2.getEdad()){
            return 1;
        } else if (s1.getEdad() < s2.getEdad()) {
            return -1;
        }else {
            return 0;
        }
    }
}
