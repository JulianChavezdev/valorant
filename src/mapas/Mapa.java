package mapas;
import java.util.ArrayList;

public abstract class Mapa {
    protected String nombreMapa;
    protected String ubicacion;
    protected boolean esCompetitivo;
    protected int puntosDeInteres;
    protected ArrayList<String> zonas;

    public Mapa() { this.zonas = new ArrayList<>(); }

    public Mapa(String nombreMapa, String ubicacion, boolean esCompetitivo, int puntosDeInteres) {
        this.nombreMapa = nombreMapa;
        this.ubicacion = ubicacion;
        this.esCompetitivo = esCompetitivo;
        this.puntosDeInteres = puntosDeInteres;
        this.zonas = new ArrayList<>();
    }

    @Override
    public String toString() { return "Mapa: " + nombreMapa + " (" + ubicacion + ")"; }
}