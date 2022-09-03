import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Establecimiento {
    private String nombre;
    private ArrayList<Cancha> canchas;
    private ArrayList<Usuario> clientes;

    private final int TIEMPOSOCIO = 60;

    private final int TURNOSPARASOCIO = 4;

    public Establecimiento(String nombre) {

        this.nombre = nombre;
        canchas = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancha> getCanchas() {
        ArrayList<Cancha> canchas_1;
        return canchas_1 = canchas;
    }

    public boolean esSocio(Usuario u){
        int contadorTurnosSocio = 0;
        for (Turno t: u.turnosUsuario
             ) {
            LocalDate diaTurno = t.getDiaTurno();
            LocalDate hoy = LocalDate.now();
            Period period = Period.between(diaTurno, hoy);
            if(period.getDays() <= TIEMPOSOCIO){
                contadorTurnosSocio++;
            }
        }
        if(contadorTurnosSocio >= TURNOSPARASOCIO){
            return true;
        }else{
            return false;
        }
    }

    public void addCancha(Cancha c){
        if(!canchas.contains(c)){
            canchas.add(c)
        }else{
            System.out.println("Ya existe la cancha");
        }
    }
}
