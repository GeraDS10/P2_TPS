public class Ciudad {

    private String nombre;
    private int cantidadHabitantes;
    private double imp1, imp2, imp3, imp4, imp5;
    private double gastos;

    public Ciudad(String nombre, int cantidadHabitantes){
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public double getImp1() {
        return imp1;
    }

    public double getImp2() {
        return imp2;
    }

    public double getImp3() {
        return imp3;
    }

    public double getImp4() {
        return imp4;
    }

    public double getImp5() {
        return imp5;
    }

    public double getGastos() {
        return gastos;
    }

    public void addRecaudacionImp1(double recaudacion){
        imp1 += recaudacion;
    }

    public void addRecaudacionImp2(double recaudacion){
        imp2 += recaudacion;
    }
    public void addRecaudacionImp3(double recaudacion){
        imp3 += recaudacion;
    }
    public void addRecaudacionImp4(double recaudacion){
        imp4 += recaudacion;
    }
    public void addRecaudacionImp5(double recaudacion){
        imp5 += recaudacion;
    }
    public void addGasto(double nuevoGasto){
        gastos += nuevoGasto;
    }
    public double getRecaudacion(){
        return getImp1() + getImp2() +getImp3() + getImp4() + getImp5();
    }

    public boolean tieneDeficit(){
        if((getRecaudacion() - getGastos() < 0)){
            return true;
        }else{
            return false;
        }
    }
}
