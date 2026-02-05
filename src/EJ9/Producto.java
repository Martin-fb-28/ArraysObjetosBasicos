package EJ9;

public class Producto {

    private String nombre;
    private int precio;

    public String getNombre(){
        return nombre;
    }

    public int getPrecio(){
        return precio;
    }
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
}
