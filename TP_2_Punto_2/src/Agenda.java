import java.util.ArrayList;

public class Agenda {

    String nombre;
    private ArrayList<Reunion> reuniones;
    private ArrayList<Usuario> asistentes;

    public Agenda(String nombre){
        this.nombre= nombre;
    }

    public void addReunion(Reunion r){
        if(this.seSuperpone(r) == false){
            reuniones.add(r);
        }else{
            System.out.println("No se puede agenar por superposicion de horarios");
        }
    }

    public void deleteReunion(Reunion r){
        if(reuniones.contains(r)){
            reuniones.remove(r);
        }
    }

    public boolean seSuperpone(Reunion r){
        for (Reunion re: reuniones
        ) {
            if(((r.getHorario_inicio() > re.getHorario_inicio())&&(r.getHorario_fin() < re.getHorario_inicio()))&&
                    ((r.getHorario_inicio() > re.getHorario_fin()) &&(r.getHorario_fin() < re.getHorario_fin()))){
            }else {
                return true;
            }
        }
        return false;
    }

    public void addAsistente(Usuario u){
        if (!asistentes.contains(u)){
            asistentes.add(u);
        }else {
            System.out.println("El asistente ya se encuentra agregado");
        }
    }

    public void deleteAsistente(Usuario u){
        if(asistentes.contains(u)){
            asistentes.remove(u);
            System.out.println("Asistente eliminado con exito");
        }else {
            System.out.println("Imposible eliminar, no existe asistente");
        }
    }

}
