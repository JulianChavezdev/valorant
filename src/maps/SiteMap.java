package maps;

import java.util.Objects;

public class SiteMap extends Map {
    private int kills;
    private int deaths;
    private int assists;
    private double combatScore;

    public SiteMap() {}

    public SiteMap(String mapName, String location, boolean isCompetitive, int pointsOfInterest, int kills, int deaths, int assists, double combatScore) {
        super(mapName, location, isCompetitive, pointsOfInterest);
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.combatScore = combatScore;
    }

    public SiteMap(int kills, int deaths, int assists, double combatScore) {
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.combatScore = combatScore;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public double getCombatScore() {
        return combatScore;
    }

    public void setCombatScore(double combatScore) {
        this.combatScore = combatScore;
    }

    @Override
    public String toString() {
        return "SiteMap{kills=" + kills + ", deaths=" + deaths +
                ", assists=" + assists + ", combatScore=" + combatScore + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SiteMap siteMap = (SiteMap) o;
        return kills == siteMap.kills && deaths == siteMap.deaths && assists == siteMap.assists && Double.compare(combatScore, siteMap.combatScore) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kills, deaths, assists, combatScore);
    }
}