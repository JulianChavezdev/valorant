package valorantArsenal;

import valorantAgent.Agent;

import java.util.Objects;

public class Knife extends Weapons {
    private int frontDamageLc;
    private int frontDamageRc;
    private int backDamageLc;
    private int backDamageRc;

    public Knife(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration, int frontDamageLc, int frontDamageRc, int backDamageLc, int backDamageRc) {
        super(name, chargedsize, price, itsAutomatic, penetration);
        this.frontDamageLc = frontDamageLc;
        this.frontDamageRc = frontDamageRc;
        this.backDamageLc = backDamageLc;
        this.backDamageRc = backDamageRc;
    }

    public Knife() {
    }

    public int getFrontDamageLc() {
        return frontDamageLc;
    }

    public void setFrontDamageLc(int frontDamageLc) {
        this.frontDamageLc = frontDamageLc;
    }

    public int getFrontDamageRc() {
        return frontDamageRc;
    }

    public void setFrontDamageRc(int frontDamageRc) {
        this.frontDamageRc = frontDamageRc;
    }

    public int getBackDamageLc() {
        return backDamageLc;
    }

    public void setBackDamageLc(int backDamageLc) {
        this.backDamageLc = backDamageLc;
    }

    public int getBackDamageRc() {
        return backDamageRc;
    }

    public void setBackDamageRc(int backDamageRc) {
        this.backDamageRc = backDamageRc;
    }
    public String frontKnifing(Agent agent1, Agent agent2){
        return agent1 + " has taken it " + this.frontDamageLc + " hp from " + agent2 + " with Knife";
    }
    public String backKnifing(Agent agent1, Agent agent2){
        return agent1 + " has taken it " + this.backDamageLc + " hp from " + agent2 + " with Knife";
    }
    public String frontKnifingRc(Agent agent1, Agent agent2){
        return agent1 + " has taken it " + this.frontDamageRc + " hp from " + agent2 + " with Knife";
    }
    public String backKnifingRc(Agent agent1, Agent agent2){
        return agent1 + " has taken it " + this.backDamageRc + " hp from " + agent2 + " with Knife";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Knife knife = (Knife) o;
        return frontDamageLc == knife.frontDamageLc && frontDamageRc == knife.frontDamageRc && backDamageLc == knife.backDamageLc && backDamageRc == knife.backDamageRc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), frontDamageLc, frontDamageRc, backDamageLc, backDamageRc);
    }

    @Override
    public String toString() {
        return "Knife{" +
                super.toString() +
                "frontDamageLc=" + frontDamageLc +
                ", frontDamageRc=" + frontDamageRc +
                ", backDamageLc=" + backDamageLc +
                ", backDamageRc=" + backDamageRc +
                '}';
    }
}
