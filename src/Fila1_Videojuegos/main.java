package Fila1_Videojuegos;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        try {
            List listaVideojuegos = new ArrayList<>();

            listaVideojuegos.add(new Juego("God of war", "Xbox", "Santa monica", "Accion - aventura"));
            listaVideojuegos.add(new JuegoAccion("The last of us", "Play Station 4", "Naughty Dog", "Accion", 2));
            listaVideojuegos.add(new JuegoEstrategia("Age of Empires II", "PC", "Ensemble Studios", "Estrategia", "No"));

            Juego.RecorrerLista((ArrayList) listaVideojuegos);
        } catch (Exception e) {
            System.out.println("No se pudo compilar");
        }
    }
}
