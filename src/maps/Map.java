package maps;

import java.util.ArrayList;

public abstract class Map {
    protected String mapName;
    protected String location;
    protected boolean isCompetitive;
    protected int pointsOfInterest;
    protected ArrayList<String> zones;

    public Map() { this.zones = new ArrayList<>(); }

    public Map(String mapName, String location, boolean isCompetitive, int pointsOfInterest) {
        this.mapName = mapName;
        this.location = location;
        this.isCompetitive = isCompetitive;
        this.pointsOfInterest = pointsOfInterest;
        this.zones = new ArrayList<>();
    }

    @Override
    public String toString() { return "Map: " + mapName + " (" + location + ")"; }
}
