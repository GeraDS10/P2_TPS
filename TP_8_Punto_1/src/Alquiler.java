import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaAlquiler;
    private Cancha c;
    private int precioAlquiler;

    public Alquiler(LocalDate fechaAlquiler, Cancha cancha, int precioAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
        this.c = cancha;
        this.precioAlquiler = precioAlquiler;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public int getIdCancha(){
        return this.c.getId();
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }
}
