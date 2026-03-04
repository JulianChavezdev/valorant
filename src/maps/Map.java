package maps;

import java.util.ArrayList;

public class Map {
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

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isCompetitive() {
        return isCompetitive;
    }

    public void setCompetitive(boolean competitive) {
        isCompetitive = competitive;
    }

    public int getPointsOfInterest() {
        return pointsOfInterest;
    }

    public void setPointsOfInterest(int pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public ArrayList<String> getZones() {
        return zones;
    }

    public void setZones(ArrayList<String> zones) {
        this.zones = zones;
    }

    public void addZone(String zone) {
        zones.add(zone);
    }
    public void removeZone(String zone) {
        zones.remove(zone);
    }
    public String findZone(String name) {
        for (String z : zones) {
            if (z.equals(name)) return z;
        }
        return null;
    }

    @Override
    public String toString() { return "Map: " + mapName + " (" + location + ")"; }
}
