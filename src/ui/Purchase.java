package ui;

public class Purchase {
    private String playerName;
    private String agentName;
    private String weaponName;
    private String weaponType;
    private double price;
    private double remainingCredits;

    public Purchase() {}

    public Purchase(String playerName, String agentName, String weaponName,
                    String weaponType, double price, double remainingCredits) {
        this.playerName       = playerName;
        this.agentName        = agentName;
        this.weaponName       = weaponName;
        this.weaponType       = weaponType;
        this.price            = price;
        this.remainingCredits = remainingCredits;
    }

    public String getPlayerName()       { return playerName; }
    public String getAgentName()        { return agentName; }
    public String getWeaponName()       { return weaponName; }
    public String getWeaponType()       { return weaponType; }
    public double getPrice()            { return price; }
    public double getRemainingCredits() { return remainingCredits; }

    @Override
    public String toString() {
        return weaponName + " (" + weaponType + ") - " + (int)price + " credits";
    }
}