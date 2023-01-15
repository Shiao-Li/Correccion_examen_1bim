package Fila1_Videojuegos;

import java.util.ArrayList;

public class Personaje {
    public static void main(String[] args) {
        private String nombre;
        private ArrayList<Personaje> personajes;

    public Juego(String nombre) {
            this.nombre = nombre;
            this.personajes = new ArrayList<Personaje>();
        }

        public void agregarPersonaje(Personaje personaje) {
            this.personajes.add(personaje);
        }

        public ArrayList<Personaje> getPersonajes() {
            return this.personajes;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
