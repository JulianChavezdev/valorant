package mapas;

public class MapaEspecial extends Mapa {
    private String mecanicaUnica;
    private boolean interactivo;
    private double alturaMaxima;
    private int complejidad;

    public MapaEspecial() {}

    public MapaEspecial(String nom, String ubi, boolean comp, int pts, String mec, boolean inter, double alt, int compj) {
        super(nom, ubi, comp, pts);
        this.mecanicaUnica = mec;
        this.interactivo = inter;
        this.alturaMaxima = alt;
        this.complejidad = compj;
    }
}