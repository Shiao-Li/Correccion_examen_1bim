package Fila2_Musica;
import java.util.ArrayList;

public class Musica {
    private String nombreGrupo, generoMusical, fechaCreacion;

    public Musica(String nombreGrupo, String generoMusical, String fechaCreacion) {
        this.nombreGrupo = nombreGrupo;
        this.generoMusical = generoMusical;
        this.fechaCreacion = fechaCreacion;
    }
    public void MostrarDatos() {
        System.out.println("\t\t" + nombreGrupo + "\n");
        System.out.println("Genero musical: " + generoMusical + "\nFecha de creacion del grupo: " + fechaCreacion );
    }
    public static void RecorrerLista(ArrayList lista){
        for (int i = 0; i < lista.size(); i++) {
            Musica MC = (Musica) lista.get(i);

            MC.MostrarDatos();
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
