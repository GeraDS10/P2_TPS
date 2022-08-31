import java.util.Date;

public class Persona {
    String nombre = "N";
    String apellido = "N";
    int edad;
    int fechaNacimiento = 1/1/2000;
    int dni;
    String sexo = "Femenino";
    double peso = 1;
    double altura = 1;

    // Inicio Constructores

    public Persona(int edad, int dni){
        this.edad = edad;
        this.dni = dni;
    }
    public Persona(int edad, int dni, String nombre){
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
    }

    public Persona(int edad, int dni, int fechaNacimiento){
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona (int edad, int dni, String nombre, int fechaNacimiento){
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona (int edad, int dni, double peso){
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
    }

    public Persona (int edad, int dni, double peso, double altura){
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    // Fin Constructores

    // Inicio Setters

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Fin Setters

    // Inicio Metodos
    public double getMasaCorporal(){
        return this.peso / (this.altura * this.altura);
    }

    public void getEstadoFisico(){
        if(getMasaCorporal() < 18.5 || getMasaCorporal() > 25){
            System.out.println("Mal estado fisico");
        }
        else {
            System.out.println("Buen estado fisico");
        }
    }

    public boolean cumpleAnios(){

    }
    public boolean esMayorEdad(){

    }

    public boolean puedeVotar(){

    }

    public boolean esCoherenteEdad(){

    }

    public String datosPersona(){

    }




}
