package stats;
import Mapa;
import java.util.ArrayList;
import java.util.HashMap;

public class HistorialPartidas {
    private String idJugador;
    private ArrayList<Mapa> listaMapas; // REQUISITO: Lista
    private HashMap<String, Estadistica> registroStats; // REQUISITO: HashMap
    private int nivelCuenta;

    public HistorialPartidas() {
        this.listaMapas = new ArrayList<>();
        this.registroStats = new HashMap<>();
    }

    // Métodos UD3: Añadir y Buscar
    public void añadirMapaAlHistorial(Mapa m) {
        listaMapas.add(m);
    }

    public void registrarEstadistica(String fecha, Estadistica e) {
        registroStats.put(fecha, e);
    }

    public void mostrarResumen() {
        for (Mapa m : listaMapas) { // Bucle
            if (m.isEsCompetitivo()) { // Condicional
                System.out.println("Jugada en competitivo: " + m.getNombreMapa());
            }
        }
    }
    // Getters, Setters y toString...
}