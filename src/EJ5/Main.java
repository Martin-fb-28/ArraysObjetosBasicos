package EJ5;

import EJ3.Alumno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EJ3.Alumno[] lista = new EJ3.Alumno[5];
        lista[0] = new Alumno("Agustín", 5.75);
        lista[1] = new Alumno("Raúl", 7);
        lista[2] = new Alumno("Yohan", 0.2);
        lista[3] = new Alumno("Jeffrey Epstein", 10);
        lista[4] = new Alumno("Diddy", 10);
        Scanner sc = new Scanner(System.in);

        System.out.println("las notas sumadas de los alumnos son: " + EJ3.Alumno.sumaNotas(lista));
        System.out.println("\nLas media de las notas de los alumnos es: " + EJ3.Alumno.MediaAlumnos(Alumno.sumaNotas(lista)));

        double notaAlta = 0;
        int posicionNota = 0;
        for(int i= 0; i<lista.length;i++){
            if(lista[i].getNota() >= notaAlta || lista[i].getNota() > 8) {
                notaAlta = lista[i].getNota();
                posicionNota = i;
            }
        }
        for(int i = 0;i< lista.length; i++){
            if(lista[i].getNota() == notaAlta){
                System.out.println("Después de la nota más alta, tenemos notas altas como la de: " + lista[i].getNombre());
            }
        }
        System.out.println("\nIntroduce el nombre del alumno del que quieras saber su nota. Escoge entre estos alumnos: 1. Diddy 2. Jeffrey Epstein 3. Raúl 4. Agustín");
        String nombredelAlumno = sc.next();

        for(int i = 0; i< lista.length; i++){
            if(nombredelAlumno.equals(lista[i].getNombre())){
                System.out.println("\nOtro de los alumnos con la nota más alta es " + lista[i].getNombre() + " con la nota " + lista[i].getNota());
            }
        }
    }
}