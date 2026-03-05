package valorantArsenal;

import valorantAgent.Agent;

import java.util.Objects;


public class Classic extends Weapons {
    private int headDamage;
    private int bodyDamage;
    private int legsDamage;
    private boolean rightclick;

    public Classic(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration, int headDamage, int bodyDamage, int legsDamage, boolean rightclick) {
        super(name, chargedsize, price, itsAutomatic, penetration);
        this.headDamage = 78;
        this.bodyDamage = 26;
        this.legsDamage = 22;
        this.rightclick = rightclick;
    }

    public Classic() {
    }

    public int getHeadDamage() {
        return headDamage;
    }

    public void setHeadDamage(int headDamage) {
        this.headDamage = headDamage;
    }

    public int getBodyDamage() {
        return bodyDamage;
    }

    public void setBodyDamage(int bodyDamage) {
        this.bodyDamage = bodyDamage;
    }

    public int getLegsDamage() {
        return legsDamage;
    }

    public void setLegsDamage(int legsDamage) {
        this.legsDamage = legsDamage;
    }

    public boolean isRightclick() {
        return rightclick;
    }

    public void setRightclick(boolean rightclick) {
        this.rightclick = rightclick;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Classic classic = (Classic) o;
        return headDamage == classic.headDamage && bodyDamage == classic.bodyDamage && legsDamage == classic.legsDamage && rightclick == classic.rightclick;
    }

    public String shootLc(Agent agent1, Agent agent2){
        int porcentege = (int)(Math.random() * 100) + 1;
        if(porcentege >=1 && porcentege <=40){
            return
        }
    }
    public String shootRc(Agent agent1, Agent agent2){
        return agent1+"has taken it "+ this.backDamageRc+ " hp from "+ agent2 + " with Knife";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), headDamage, bodyDamage, legsDamage, rightclick);
    }

    @Override
    public String toString() {
        return "Classic{" +
                "headDamage=" + headDamage +
                ", bodyDamage=" + bodyDamage +
                ", legsDamage=" + legsDamage +
                ", rightclick=" + rightclick +
                '}';
    }

}
