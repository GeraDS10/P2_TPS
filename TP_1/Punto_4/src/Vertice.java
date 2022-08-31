public class Vertice {

    int coodenadaX;
    int coordenadaY;

    //Constructor

    public Vertice(int coodenadaX, int coodenadaY){
        this.coodenadaX = coodenadaX;
        this.coordenadaY = coodenadaY;
    }

    //Setters

    public void setCoodenadaX(int x){
        this.coodenadaX = x;
    }

    public void setCoordenadaY(int y){
        this.coordenadaY = y;
    }

    //Getters

    public int getCoodenadaX() {
        return coodenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    //Funcionalidades

    public void desplazarCoordenadas(int x, int y){
        this.coodenadaX += x;
        this.coordenadaY += y;
    }
}
