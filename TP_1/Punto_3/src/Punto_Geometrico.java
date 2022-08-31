import static java.lang.Math.round;

public class Punto_Geometrico {
    int x = 0;
    int y = 0;

    // Constructores
    public Punto_Geometrico(){

    }
    public Punto_Geometrico(int x){
        this.x = x;
    }

    public Punto_Geometrico(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Get

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void getCoordenadas(){
        System.out.println("Coordenada x: " + this.getX() + ", Coordenada y: " + this.getY());
    }

    //Funcionalidades

    public void desplazarPunto(int x, int y){
        this.x += x;
        this.y += y;
    }

    public double distanciaEuclidea(int newX, int newY){
        double distancia = Math.sqrt((Math.pow((this.getX()-newX), 2)) + (Math.pow((this.getY()-newY), 2)));
        return distancia;
    }

}
