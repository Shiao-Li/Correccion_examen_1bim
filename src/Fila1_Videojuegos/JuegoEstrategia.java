package Fila1_Videojuegos;

public class JuegoEstrategia extends Juego {
    private String online;

    public JuegoEstrategia(String titulo, String consola, String estudioCreador, String genero, String online) {
        super(titulo, consola, estudioCreador, genero);
        setOnline(online);
    }

    public void setOnline(String online) {
        this.online = online;
    }
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("--> Admite juego online: " +online);
    }
}
