package EJ3;

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

    public static double sumaNotas(Alumno [] notaAlumnos){
        double notasSumadas = 0;
        for(int i = 0; i<notaAlumnos.length; i++){
            notasSumadas += notaAlumnos[i].getNota();
        }
        return notasSumadas;
    }

    public static double MediaAlumnos(double notasAlumnos){
        double media = 0;
        media = notasAlumnos/5;
        return media;
    }
}
