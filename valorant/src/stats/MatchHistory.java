package stats;

import java.util.ArrayList;
import java.util.HashMap;
import maps.Map;

public class MatchHistory {
    private String playerId;
    private ArrayList<Map> mapList;
    private HashMap<String, Statistic> statsRecord; 

    public MatchHistory() {
        this.mapList = new ArrayList<>();
        this.statsRecord = new HashMap<>();
    }

    public void addMap(Map m) { 
        this.mapList.add(m); 
    }

    public void recordStat(String date, Statistic s) { 
        this.statsRecord.put(date, s); 
    }

    public void removeStat(String date) {
        if(statsRecord.containsKey(date)) {
            statsRecord.remove(date); 
        }
    }

    // Requisito UD3: Bucle de búsqueda (2/4)
    public Map findMapInHistory(String name) {
        for (Map m : mapList) {
            if (m.getMapName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }
}