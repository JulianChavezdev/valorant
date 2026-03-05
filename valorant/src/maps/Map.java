package maps;

import java.util.ArrayList;

public abstract class Map {
    protected String mapName;
    protected String location;
    protected boolean isCompetitive;
    protected int pointsOfInterest;
    protected ArrayList<String> zones;

    public Map() { 
        this.zones = new ArrayList<>(); 
    }

    public Map(String mapName, String location, boolean isCompetitive, int pointsOfInterest) {
        this.mapName = mapName;
        this.location = location;
        this.isCompetitive = isCompetitive;
        this.pointsOfInterest = pointsOfInterest;
        this.zones = new ArrayList<>();
    }

    // Requisito UD3: Método con bucle para gestionar la lista
    public boolean removeZone(String zoneName) {
        for (int i = 0; i < zones.size(); i++) {
            if (zones.get(i).equalsIgnoreCase(zoneName)) {
                zones.remove(i);
                return true;
            }
        }
        return false;
    }

    public void addZone(String zone) { 
        this.zones.add(zone); 
    }

    // Getter fundamental para que el buscador de MatchHistory no de error
    public String getMapName() { 
        return mapName; 
    }

    @Override
    public String toString() { 
        return "Map: " + mapName + " at " + location; 
    }
}