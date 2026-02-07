package stats;
import mapas.Mapa;
import java.util.ArrayList;
import java.util.HashMap;

public class HistorialPartidas {
    private String idJugador;
    private ArrayList<Mapa> listaMapas;
    private HashMap<String, Estadistica> registroStats;
    private int nivelCuenta;

    public HistorialPartidas() {
        this.listaMapas = new ArrayList<>();
        this.registroStats = new HashMap<>();
    }

    public void añadirMapa(Mapa m) { this.listaMapas.add(m); }
    public void registrarStat(String fecha, Estadistica e) { this.registroStats.put(fecha, e); }
}