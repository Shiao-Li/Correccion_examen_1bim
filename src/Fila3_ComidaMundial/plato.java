package Fila3_ComidaMundial;
import java.util.ArrayList;

public class plato {
    private String NomPlato, chef, tipoPlato;

    public plato(String nomPlato, String chef, String tipoPlato) {
        this.NomPlato = nomPlato;
        this.chef = chef;
        this.tipoPlato = tipoPlato;
    }
    public void MostrarDatos() {
        System.out.println("\t\t" + NomPlato + "\n");
        System.out.println("Elaborado por: " + chef + "\nTipo de plato: " + tipoPlato );
    }
    public static void RecorrerLista(ArrayList lista){
        for (int i = 0; i < lista.size(); i++) {
            plato PM = (plato) lista.get(i);

            PM.MostrarDatos();
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
