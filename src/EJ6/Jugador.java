package EJ6;

public class Jugador {
    private int vida;
    private String nombre;

    public int getVida() {
        return vida;
    }
    public String getNombre(){
        return nombre;
    }

    public Jugador(int vidaJugador, String nombreJugador){
        this.vida = vidaJugador;
        this.nombre = nombreJugador;
    }

    public boolean estaVivo(int vidaJugador){
        if(vidaJugador <= 0){
            return false;
        }else {
            return true;
        }
    }

}
