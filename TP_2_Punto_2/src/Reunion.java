import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {

    private ArrayList <Usuario> participantes;
    private double horario_inicio;
    private double horario_fin;
    private String tema;
    private String lugar;

    //Constructor

    public Reunion(double horario_inicio, double horario_fin, String tema, String lugar) {
        if(horario_inicio < horario_fin){
            this.horario_inicio = horario_inicio;
            this.horario_fin = horario_fin;
            this.tema = tema;
            this.lugar = lugar;
        }
    }

    //Getters y Setters


    public double getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(double horario_inicio) {
        if(horario_inicio < this.horario_fin){
            this.horario_inicio = horario_inicio;
        }else {
            System.out.println("El horario de inicio no puede ser posterior a el horario de fin");
        }

    }

    public double getHorario_fin() {
        return horario_fin;
    }

    public void setHorario_fin(double horario_fin) {
        if(horario_fin > this.horario_inicio){
            this.horario_fin = horario_fin;
        }else {
            System.out.println("El horario de finalizacion no puede ser anterior al inicio de la reunion");
        }

    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // Funcionalidades

    public void addUsuario(Usuario u){
        if(!participantes.contains(u)){
            participantes.add(u);
        }else{
            System.out.println("El usuario ya se encuentra en el listado");
        }
    }

    public void deleteUsuario(Usuario u){
        if(participantes.contains(u)){
            participantes.remove(u);
        }
    }

    public ArrayList<Usuario> getParticipantes(){
        ArrayList<Usuario> participandos;
        return  participandos = participantes;
    }

}
