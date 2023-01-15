package Fila2_Musica;

public class MusicaFolclorica extends Musica {
    private String paisFundacion;

    public MusicaFolclorica(String nombreGrupo, String generoMusical, String fechaCreacion, String paisFundacion) {
        super(nombreGrupo, generoMusical, fechaCreacion);
        setPaisFundacion(paisFundacion);
    }

    public void setPaisFundacion(String paisFundacion) {
        this.paisFundacion = paisFundacion;
    }
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("--> Fundada en: " +paisFundacion);
    }
}
