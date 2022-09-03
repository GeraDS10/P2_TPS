import java.util.ArrayList;

public class Cancha {
    private String deporte;
    private ArrayList<Turno> turnos;
    private int valor;


    public Cancha(String deporte, ArrayList<Turno> turnos, int valor) {
        this.deporte = deporte;
        this.valor = valor;
        turnos = new ArrayList<>();
    }

    // Setters y Getters


    public int getValor(Turno t) {
        t.getUsuarioReserva();
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public ArrayList<Turno> getTurnos() {
        ArrayList<Turno> turnos1;
        return turnos1 = turnos;
    }

    public void addTurno(Turno t){
        for (Turno tur: turnos
             ) {
            if(((t.getHoraInicio() < tur.getHoraInicio()) && (t.getHoraFin() < tur.getHoraInicio())) ||
                    (t.getHoraInicio() > tur.getHoraFin())){

            }else{
                System.out.println("Imposible agregar turno. Superposicion de turno");
            }
        }
    }

    public void deleteTurno(Turno t){
        if(turnos.contains(t)){
            turnos.remove(t);
            System.out.println("Turno removido con exito");
        }else{
            System.out.println("No existe el turno que desea eliminar");
        }
    }

}
