package EJ9;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Introduzca el valor, entero no decimal, de los siguientes productos: 1. CocaCola / 2. Monster / 3. Whisky / 4. Kebab / 5. Tabaco");

        Producto[] arrayProductos = new Producto[5];
        System.out.printf("CocaCola: ");
        arrayProductos[0] = new Producto("CocaCola", sc.nextInt());
        System.out.printf("Monster: ");
        arrayProductos[1] = new Producto("Monster", sc.nextInt());
        System.out.printf("Whisky: ");
        arrayProductos[2] = new Producto("Whisky", sc.nextInt());
        System.out.printf("Kebab: ");
        arrayProductos[3] = new Producto("Kebab", sc.nextInt());
        System.out.printf("Tabaco: ");
        arrayProductos[4] = new Producto("Tabaco", sc.nextInt());

        int valormasAlto = 0;

        for(int i = 0; i< arrayProductos.length; i++){
            if(arrayProductos[i].getPrecio() > valormasAlto){
                valormasAlto = arrayProductos[i].getPrecio();
            }
        }

        int valorRandom = rand.nextInt(0, valormasAlto) + 1;

        for(int i = 0; i< arrayProductos.length; i++){
            if(arrayProductos[i].getPrecio() > valorRandom){
                System.out.println("\nEl producto es: " + arrayProductos[i].getNombre());
            }
        }

    }
}
