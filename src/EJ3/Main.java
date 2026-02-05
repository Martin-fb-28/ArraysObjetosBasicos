package EJ3;

public class Main {
    public static void main(String[] args){

        Alumno[] lista = new Alumno[5];
        lista [0] = new Alumno("Agustín",5.75);
        lista [1] = new Alumno("Raúl", 6);
        lista [2] = new Alumno("Yohan", 0.2);
        lista [3] = new Alumno("Jeffrey Epstein", 10);
        lista [4] = new Alumno("Diddy", 8);

        System.out.println("las notas sumadas de los alumnos son: " + Alumno.sumaNotas(lista));
        System.out.println("\nLas media de las notas de los alumnos es: " + Alumno.MediaAlumnos(Alumno.sumaNotas(lista)));
    }
}
