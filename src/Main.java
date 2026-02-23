import maps.*;
import stats.*;

public class Main {
    public static void main(String[] args) {
        // 1. Create objects (2 of each child class for the rubric)
        MapSite bind = new MapSite("Bind", "Morocco", true, 5, 2, true, 45.0, true);
        MapSite haven = new MapSite("Haven", "Bhutan", true, 7, 3, false, 60.0, false);

        SpecialMap range = new SpecialMap("The Range", "Island", false, 10, "Training", true, 100.0, 1);
        SpecialMap abyss = new SpecialMap("Abyss", "Unknown", true, 6, "Falls", true, 250.0, 5);

        // 2. Manage Match History
        MatchHistory h = new MatchHistory();
        h.addMap(bind);
        h.addMap(range);

        Statistic s1 = new Statistic(22, 11, 4, 280.5);
        h.recordStat("2024-03-22", s1);

        System.out.println("--- VALORANT PROJECT: KINGDOM CORPORATION ---");
        System.out.println("Data structure loaded successfully.");
        System.out.println("Current map: " + bind.toString());
    }
}
