package Fila3_ComidaMundial;

public class ComidaEcuatoriana extends plato {
    private String ProvinciaOrigen;

    public ComidaEcuatoriana(String nomPlato, String chef, String tipoPlato, String ProvinciaOrigen) {
        super(nomPlato, chef, tipoPlato);
        setProvinciaOrigen(ProvinciaOrigen);
    }

    public void setProvinciaOrigen(String provinciaOrigen) {
        ProvinciaOrigen = provinciaOrigen;
    }

    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
        System.out.println("--> Provincia ecuatoriana de origen: " + ProvinciaOrigen);
    }
}
