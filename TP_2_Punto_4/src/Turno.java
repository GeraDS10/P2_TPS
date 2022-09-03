import java.time.LocalDate;
import java.time.LocalDateTime;

public class Turno {
    private double horaInicio;
    private double horaFin;
    private Usuario usuarioReserva;
    private LocalDate diaTurno;

    // Constructor

    public Turno(double horaInicio, double horaFin, Usuario usuario, LocalDate dia) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.usuarioReserva = usuario;
        this.diaTurno = dia;
        usuario.addTurno(this);
    }

    // Getters y Setters

    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(double horaFin) {
        this.horaFin = horaFin;
    }


    public Usuario getUsuarioReserva() {
        return usuarioReserva;
    }

    public void setUsuarioReserva(Usuario usuarioReserva) {
        this.usuarioReserva = usuarioReserva;
    }

    public LocalDate getDiaTurno() {
        return diaTurno;
    }

    public void setDiaTurno(LocalDate diaTurno) {
        this.diaTurno = diaTurno;
    }
}
