import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean pagoUltimaCuota = false;
    private ArrayList<Alquiler> alquileres;

    public Socio(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad(){
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public void addAlquiler(Alquiler a){
        this.alquileres.add(a);
    }

   /* Prueba fechas
    public static void main(String[] args) {
        Socio s1 = new Socio("Carlos", "Sanchez", LocalDate.of(1992, 10, 15));
        Socio s2 = new Socio("Pedro", "Gomez", LocalDate.of(1992, 11, 15));
        Socio s3 = new Socio("Juan", "Perez", LocalDate.of(2000, 1, 15));

        System.out.println(s1.getEdad());
        System.out.println(s2.getEdad());
        System.out.println(s3.getEdad());
    }

    */
}
