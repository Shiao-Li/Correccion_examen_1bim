package Fila1_Videojuegos;

import java.util.ArrayList;

public class Juego {
    private String titulo, consola, estudioCreador;
    private String genero;

    public Juego(String titulo, String consola, String estudioCreador, String genero) {
        this.titulo = titulo;
        this.consola = consola;
        this.estudioCreador = estudioCreador;
        this.genero = genero;
    }

    public void MostrarDatos() {
        System.out.println("\t\t" + genero + "\n");
        System.out.println("Titulo del videojuego: " + titulo + "\nConsola de juego: " + consola + "\nDesarollado por: " + estudioCreador);
    }
    public static void RecorrerLista(ArrayList lista){
        for (int i = 0; i < lista.size(); i++) {
            Juego JG = (Juego)lista.get(i);

            JG.MostrarDatos();
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
