import java.util.ArrayList;

public class EmpresaAgricola {
    private String nombre;
    private ArrayList<Agroquimico> agroquimicos;

    public EmpresaAgricola(String nombre){
        this.nombre = nombre;
        agroquimicos = new ArrayList<Agroquimico>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Agroquimico> tratanEnfermedad(Enfermedad e){
        ArrayList<Agroquimico> resultado = new ArrayList<Agroquimico>();
        for (Agroquimico a: agroquimicos
             ) {
            if(e.puedeTratarte(a)){
                resultado.add(a);
            }
        }
        return resultado;
    }

    public ArrayList<Agroquimico> tratanCultivoYEnfermedad(Cultivo c, Enfermedad e){
        ArrayList<Agroquimico> resultado = new ArrayList<Agroquimico>();
        for (Agroquimico a: this.agroquimicos
             ) {
            if (!a.cultivoDesaconsejado(c)){
                if (e.puedeTratarte(a)){
                    resultado.add(a);
                }
            }
        }
        return resultado;
    }
}
