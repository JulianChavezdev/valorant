import maps.*;
import stats.*;

public class Main {
    public static void main(String[] args) {
        MatchHistory history = new MatchHistory();

        // Crear objetos de prueba
        SiteMap bind = new SiteMap("Bind", "Morocco", true, 3, "A", 2);
        SpecialMap abyss = new SpecialMap("Abyss", "Norway", true, 4, "Falls", true, 50.0, 7);

        // Añadir a colecciones
        history.addMap(bind);
        history.addMap(abyss);
        history.recordStat("2026-03-05", new Statistic(20, 10, 5, 300.5));

        // Probar buscador
        System.out.println("--- VALORANT SYSTEM READY ---");
        Map found = history.findMapInHistory("Bind");
        
        if (found != null) {
            System.out.println("Found: " + found.toString());
        } else {
            System.out.println("Map not found in history.");
        }
    }
}