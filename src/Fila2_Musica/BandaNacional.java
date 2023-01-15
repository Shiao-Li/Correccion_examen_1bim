package Fila2_Musica;

public class BandaNacional extends Musica {
    private int numMusicos;

    public BandaNacional(String nombreGrupo, String generoMusical, String fechaCreacion, int numMusicos) {
        super(nombreGrupo, generoMusical, fechaCreacion);
        setNumMusicos(numMusicos);
    }

    public void setNumMusicos(int numMusicos) {
        this.numMusicos = numMusicos;
    }
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("--> Numero de musicos en escena: " +numMusicos);
    }
}
