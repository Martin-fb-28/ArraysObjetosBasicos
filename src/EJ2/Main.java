package EJ2;

import EJ1.Alumno;

public class Main {
        public static void main(String[] args){

            EJ1.Alumno[] lista = new EJ1.Alumno[5];
            lista [0] = new EJ1.Alumno("Agustín",1.5);
            lista [1] = new EJ1.Alumno("Raúl", 5);
            lista [2] = new EJ1.Alumno("Yohan", 0);
            lista [3] = new EJ1.Alumno("Jeffrey Epstein", 10);
            lista [4] = new Alumno("Diddy", 4);

            for(int i=0; i< lista.length; i++){
                if(lista[i].getNota()>0 &&  lista[i].getNota()<5){
                    lista[i].mostrarDatos();
                }
            }
        }
}
