package stats;

public class Estadistica {
    private int asesinatos;
    private int muertes;
    private int asistencias;
    private double puntuacionCombate;

    public Estadistica() {}
    public Estadistica(int asesinatos, int muertes, int asistencias, double puntuacionCombate) {
        this.asesinatos = asesinatos;
        this.muertes = muertes;
        this.asistencias = asistencias;
        this.puntuacionCombate = puntuacionCombate;
    }
    // Getters, Setters y toString...
}