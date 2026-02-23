package stats;

import maps.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class MatchHistory {
    private String playerId;
    private ArrayList<Map> mapList;
    private HashMap<String, Statistic> statsRecord;
    private int accountLevel;

    public MatchHistory() {
        this.mapList = new ArrayList<>();
        this.statsRecord = new HashMap<>();
    }

    public void addMap(Map m) { this.mapList.add(m); }
    public void recordStat(String date, Statistic s) { this.statsRecord.put(date, s); }
}
