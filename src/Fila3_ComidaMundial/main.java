package Fila3_ComidaMundial;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List listaComidaMundial = new ArrayList<>();
        try {
            listaComidaMundial.add(new plato("Hamburguesa", "Walter Anderson", "Comida Rapida"));
            listaComidaMundial.add(new ComidaEcuatoriana("Sopa de pata", "Alberto Guzmán", "Comida tradicional", "Carchi"));
            listaComidaMundial.add(new ComidaChina("Mapo tofu", "zhen xiang dong ", "Plato originario chino", "Picante"));

            plato.RecorrerLista((ArrayList) listaComidaMundial);
        } catch (Exception e) {
            System.out.println("No se pudo compilar");
        }
    }
}
