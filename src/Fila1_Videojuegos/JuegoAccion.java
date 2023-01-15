package Fila1_Videojuegos;

public class JuegoAccion extends Juego {
    private int numJugadores;

    public JuegoAccion(String titulo, String consola, String estudioCreador, String genero, int numJugadores) {
        super(titulo, consola, estudioCreador, genero);
        setNumJugadores(numJugadores);
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
        System.out.println("--> Admite " + numJugadores + " jugadores locales.");
    }
}
