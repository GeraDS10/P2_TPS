import java.util.ArrayList;

public class Peluqueria {

    private String nombre;
    private ArrayList<Peluquero>peluqueros;
    private ArrayList<Cliente>clientes;

    public Peluqueria(String nombre){
        this.nombre = nombre;
        peluqueros = new ArrayList<Peluquero>();
        clientes = new ArrayList<Cliente>();
    }

    public void addPeluquero(Peluquero p){
        if(!peluqueros.contains(p)){
            peluqueros.add(p);
        }else {
            System.out.println("El peluquero ya se encuentra agregado");
        }
    }

    public void addCliente(Cliente c){
        if(!clientes.contains(c)){
            clientes.add(c).
        }
    }
}
