import java.util.ArrayList;

public class Usuario {
    private String nombre;
    ArrayList<Turno> turnosUsuario;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public void addTurno(Turno t){
    turnosUsuario.add(t);
    }

    public ArrayList getTurnos(){
        ArrayList<Turno> turnos = new ArrayList<>();
        return turnos = turnosUsuario;
    }
}
