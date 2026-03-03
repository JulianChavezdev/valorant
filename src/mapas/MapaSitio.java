package stats;

public class Statistic {
    private int kills;
    private int deaths;
    private int assists;
    private double combatScore;

    public Statistic() {}

    public Statistic(int kills, int deaths, int assists, double combatScore) {
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.combatScore = combatScore;
    }
}
