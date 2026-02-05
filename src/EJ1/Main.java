public class Main{
    public static void main(String[] args){

        Alumno[] lista = new Alumno[5];
        lista [0] = new Alumno("Agustín",5.75);
        lista [1] = new Alumno("Raúl", 6);
        lista [2] = new Alumno("Yohan", 0.2);
        lista [3] = new Alumno("Jeffrey Epstein", 10);
        lista [4] = new Alumno("Diddy", 8);

        for(int i=0; i< lista.length; i++){
            lista[i].mostrarDatos();
        }
    }
}