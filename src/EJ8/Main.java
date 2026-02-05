package EJ7;

import java.util.Random;
public class Main{
    public static void main(String[] args){
        Random rand = new Random();

        EJ7.Jugador arrayJugadores[] = new Jugador[4];
        arrayJugadores[0] = new Jugador(rand.nextInt(0,101), "Agustín" );
        arrayJugadores[1] = new Jugador(rand.nextInt(0,101), "Diddy");
        arrayJugadores[2] = new Jugador(rand.nextInt(0,101), "Trump");
        arrayJugadores[3] = new Jugador(0, "Epstein");

        for(int i = 0; i< arrayJugadores.length; i++) {
            if (arrayJugadores[i].getVida() > 0) {
                System.out.println(arrayJugadores[i].estaVivo(arrayJugadores[i].getVida()));
            }
        }

        for(int i = 0; i< arrayJugadores.length; i++){
            arrayJugadores[i].recibirDanio();
            System.out.println("\nTras recibir daño, los jugadores tienen esta vida restante: " + arrayJugadores[i].getNombre() + ": " + arrayJugadores[i].getVida());
        }

    }
}