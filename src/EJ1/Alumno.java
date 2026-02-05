package EJ1;

public class Alumno {
    private String nombre;
    private double nota;

    public String getNombre() {
        return this.nombre;
    }

    public double getNota() {
        return this.nota;
    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + " Nota: " + this.nota);
    }
}