public class Rectangulo {
    Vertice v1;
    Vertice v2;
    Vertice v3;
    Vertice v4;

    // Constructor
    public Rectangulo(Vertice v1, Vertice v2, Vertice v3, Vertice v4){

        if(esRectangulo(v1, v2, v3, v4)){
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
            this.v4 = v4;
        }
    }

    //Constructor Punto 4

    public Rectangulo(Vertice v1, int alto, int ancho){
        this.v1 = v1;
        this.v2.setCoodenadaX(v1.getCoodenadaX() + ancho);
        this.v2.setCoordenadaY(v1.getCoordenadaY());
        this.v3.setCoodenadaX(v1.getCoodenadaX() + ancho);
        this.v3.setCoordenadaY(v1.getCoodenadaX() + ancho);
        this.v4.setCoodenadaX(v1.getCoodenadaX());
        this.v4.setCoordenadaY(v1.getCoordenadaY() - alto);
    }

    //Funcionalidades
    public boolean esRectangulo(Vertice v1, Vertice v2, Vertice v3, Vertice v4){
        if(v1.coordenadaY == v2.coordenadaY &&
                v3.getCoordenadaY() != v1.getCoordenadaY() &&
                    v3.getCoordenadaY() == v4.getCoordenadaY() &&
                        v1.getCoodenadaX() == v4.getCoodenadaX() &&
                            v2.getCoodenadaX() == v3.getCoodenadaX()){
            return true;
        } else {
            return false;
        }
    }

    public void desplazarRectangulo(int x, int y){
        v1.desplazarCoordenadas(x, y);
        v2.desplazarCoordenadas(x, y);
        v3.desplazarCoordenadas(x, y);
        v4.desplazarCoordenadas(x, y);
    }

    public int getAncho(){
        int ancho = this.v3.getCoodenadaX() - this.v1.getCoodenadaX();
        return ancho;
    }
    public int getAlto(){
        int alto = this.v1.getCoordenadaY()-this.v4.getCoordenadaY();
        return alto;
    }

    public int getArea(){
        int area = this.getAlto() * this.getAncho();
        return area;
    }

    public int esIgual(int areaOtro){
        int diferencia = this.getArea() - areaOtro;
        if(diferencia == 0){
            return 0;
        } else if (diferencia > 0) {
            return 1;
        }else {
            return -1;
        }
    }

    public boolean esCuadrado(){
        if(this.getAncho() == this.getAlto()){
            return true;
        }else {
            return false;
        }
    }

    public int largoMayor(){
        if(this.esCuadrado()){
            return this.getAlto();
        } else if ((this.getAlto() - this.getAncho() < 0)){
            return this.getAncho();
        } else{
            return this.getAlto();
        }
    }

    public void getPosicion(){
        if(this.getAlto() > this.getAncho()){
            System.out.println("El cuadrado esta parado");
        }else {
            System.out.println("El cuadrado esta acostado");
        }
    }
}
