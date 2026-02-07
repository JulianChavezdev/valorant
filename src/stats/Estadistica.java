package stats;

public class Estadistica {
    private int asesinatos;
    private int muertes;
    private int asistencias;
    private double puntuacionCombate;

    public Estadistica() {}

    public Estadistica(int as, int mu, int asi, double punt) {
        this.asesinatos = as;
        this.muertes = mu;
        this.asistencias = asi;
        this.puntuacionCombate = punt;
    }
}