package valorantArsenal;

import valorantAgent.Agent;

import java.util.Objects;

public class Sniper extends Weapons {
    private int headDamage;
    private int bodyDamage;
    private int legsDamage;

    public boolean isScoped() {
        
    }

    public enum Scope {OUTLAW, MARSHAL, OPERATORMIN, OPERATORMAX};
    protected Scope scope;

    public Sniper(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration, int headDamage, int legsDamage, Scope scope, int bodyDamage) {
        super(name, chargedsize, price, itsAutomatic, penetration);
        this.headDamage = headDamage;
        this.legsDamage = legsDamage;
        this.scope = scope;
        this.bodyDamage = bodyDamage;
    }

    public Sniper(int headDamage, int bodyDamage, int legsDamage, Scope scope) {
        this.headDamage = headDamage;
        this.bodyDamage = bodyDamage;
        this.legsDamage = legsDamage;
        this.scope = scope;
    }

    public Sniper() {
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

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String shoot(Agent agent1, Agent agent2) {
        int chance = (int)(Math.random() * 100) + 1;
        int damage;
        String zone;

        if (chance <= 15) {
            damage = headDamage;
            zone = "head";
        } else if (chance <= 70) {
            damage = bodyDamage;
            zone = "body";
        } else {
            damage = legsDamage;
            zone = "legs";
        }

        agent2.setBaseLife(agent2.getBaseLife() - damage);

        if (agent2.getBaseLife() <= 0) {
            agent2.setBaseLife(0);
            agent2.isAlive(false);
            return agent1.getName() + " eliminated " + agent2.getName() +
                    " with a shot to the " + zone + " (-" + damage + " hp)";
        }

        return agent1.getName() + " shot " + agent2.getName() +
                " in the " + zone + " (-" + damage + " hp). Remaining HP: " +
                agent2.getBaseLife();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sniper sniper = (Sniper) o;
        return headDamage == sniper.headDamage && bodyDamage == sniper.bodyDamage && legsDamage == sniper.legsDamage && scope == sniper.scope;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), headDamage, bodyDamage, legsDamage, scope);
    }

    @Override
    public String toString() {
        return "Sniper{" +
                "headDamage=" + headDamage +
                ", bodyDamage=" + bodyDamage +
                ", legsDamage=" + legsDamage +
                ", scope=" + scope +
                '}';
    }
}
