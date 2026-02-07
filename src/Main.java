import mapas.*;
import stats.*;

public class Main {
    public static void main(String[] args) {
        // 1. Crear objetos (2 de cada clase hija para la rúbrica)
        MapaSitio bind = new MapaSitio("Bind", "Marruecos", true, 5, 2, true, 45.0, true);
        MapaSitio haven = new MapaSitio("Haven", "Bután", true, 7, 3, false, 60.0, false);
        
        MapaEspecial range = new MapaEspecial("The Range", "Isla", false, 10, "Entrenamiento", true, 100.0, 1);
        MapaEspecial abyss = new MapaEspecial("Abyss", "Desconocida", true, 6, "Caídas", true, 250.0, 5);

        // 2. Gestionar Historial
        HistorialPartidas h = new HistorialPartidas();
        h.añadirMapa(bind);
        h.añadirMapa(range);
        
        Estadistica s1 = new Estadistica(22, 11, 4, 280.5);
        h.registrarStat("2024-03-22", s1);

        System.out.println("--- PROYECTO VALORANT: KINGDOM CORPORATION ---");
        System.out.println("Estructura de datos cargada correctamente.");
        System.out.println("Mapa actual: " + bind.toString());
    }
}