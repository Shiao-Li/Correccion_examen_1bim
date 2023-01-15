package Fila2_Musica;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        try {
            List listaGruposMusicales = new ArrayList<>();

            listaGruposMusicales.add(new Musica("Calibre 50", "Regional Mexicana", "2010"));
            listaGruposMusicales.add(new BandaNacional("Don Medardo y sus Players", "Cumbia", "16/09/1937", 18));
            listaGruposMusicales.add(new MusicaFolclorica("kjarkas", "Musica Folclorica", "23/06/1971", "Bolivia"));

            Musica.RecorrerLista((ArrayList) listaGruposMusicales);
        } catch (Exception e) {
            System.out.println("No se pudo compilar");
        }
    }
}
