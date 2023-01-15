package Fila3_ComidaMundial;

public class ComidaChina extends plato {
    private String sabor;
    public ComidaChina(String nomPlato, String chef, String tipoPlato, String sabor) {
        super(nomPlato, chef, tipoPlato);
        setSabor(sabor);
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
        System.out.println("--> Tipo de sabor: " + sabor );
    }
}
