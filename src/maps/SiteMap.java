import java.util.Map;

public class SiteMap extends Map {
    private int kills;
    private int deaths;
    private int assists;
    private double combatScore;


    public SiteMap(int kills, int deaths, int assists) {
    }

    public SiteMap(int kills, int deaths, int assists, double combatScore) {
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.combatScore = combatScore;
    }
}