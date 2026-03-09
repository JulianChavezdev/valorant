package valorantArsenal;

import valorantAgent.Agent;
import java.util.Objects;

public class Classic extends Weapons {
    private static int headDamage;
    private static int bodyDamage;
    private static int legsDamage;
    private boolean rightclick;

    public Classic(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration, int headDamage, int bodyDamage, int legsDamage, boolean rightclick) {
        super(name, chargedsize, price, itsAutomatic, penetration);
        this.headDamage = headDamage;
        this.bodyDamage = bodyDamage;
        this.legsDamage = legsDamage;
        this.rightclick = rightclick;
    }

    public Classic() {}

    public int getHeadDamage() { return headDamage; }
    public void setHeadDamage(int headDamage) { this.headDamage = headDamage; }

    public int getBodyDamage() { return bodyDamage; }
    public void setBodyDamage(int bodyDamage) { this.bodyDamage = bodyDamage; }

    public int getLegsDamage() { return legsDamage; }
    public void setLegsDamage(int legsDamage) { this.legsDamage = legsDamage; }

    public boolean isRightclick() { return rightclick; }
    public void setRightclick(boolean rightclick) { this.rightclick = rightclick; }

    public static String shootLc(Agent agent1, Agent agent2) {
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
            agent2.getisAlive();
            return agent1.getName() + " eliminated " + agent2.getName() +
                    " with a shot to the " + zone + " (-" + damage + " hp)";
        }

        return agent1.getName() + " shot " + agent2.getName() +
                " in the " + zone + " (-" + damage + " hp). Remaining HP: " +
                agent2.getBaseLife();
    }

    public String shootRc(Agent agent1, Agent agent2) {
        int chance = (int)(Math.random() * 7) + 1;
        int pellets = 3;
        if (chance == 1){
            int totalDamage= 3*headDamage;
            agent2.setBaseLife(agent2.getBaseLife() - totalDamage);

            if (agent2.getBaseLife() <= 0) {
                agent2.setBaseLife(0);
                agent2.isDeath();
                return agent1.getName() + " eliminated " + agent2.getName() +
                        " with right-click shot (-" + totalDamage + " hp)";
            }

            return agent1.getName() + " hit " + agent2.getName() +
                    " with right-click shot (-" + totalDamage + " hp). Remaining HP: " +
                    agent2.getBaseLife();
        }
        else if (chance == 2){
            int totalDamage= 2*headDamage + bodyDamage;
            agent2.setBaseLife(agent2.getBaseLife() - totalDamage);

            if (agent2.getBaseLife() <= 0) {
                agent2.setBaseLife(0);
                agent2.isDeath();
                return agent1.getName() + " eliminated " + agent2.getName() +
                        " with right-click shot (-" + totalDamage + " hp)";
            }

            return agent1.getName() + " hit " + agent2.getName() +
                    " with right-click shot (-" + totalDamage + " hp). Remaining HP: " +
                    agent2.getBaseLife();
        }
        else if (chance == 3){
            int totalDamage= headDamage+2*bodyDamage;
            agent2.setBaseLife(agent2.getBaseLife() - totalDamage);

            if (agent2.getBaseLife() <= 0) {
                agent2.setBaseLife(0);
                agent2.isDeath();
                return agent1.getName() + " eliminated " + agent2.getName() +
                        " with right-click shot (-" + totalDamage + " hp)";
            }

            return agent1.getName() + " hit " + agent2.getName() +
                    " with right-click shot (-" + totalDamage + " hp). Remaining HP: " +
                    agent2.getBaseLife();
        }
        else if (chance == 4){
            int totalDamage= 3*bodyDamage;
            agent2.setBaseLife(agent2.getBaseLife() - totalDamage);

            if (agent2.getBaseLife() <= 0) {
                agent2.setBaseLife(0);
                agent2.isDeath();
                return agent1.getName() + " eliminated " + agent2.getName() +
                        " with right-click shot (-" + totalDamage + " hp)";
            }

            return agent1.getName() + " hit " + agent2.getName() +
                    " with right-click shot (-" + totalDamage + " hp). Remaining HP: " +
                    agent2.getBaseLife();
        }
        else if (chance == 5){
            int totalDamage= 2*headDamage+legsDamage;
            agent2.setBaseLife(agent2.getBaseLife() - totalDamage);

            if (agent2.getBaseLife() <= 0) {
                agent2.setBaseLife(0);
                agent2.isDeath();
                return agent1.getName() + " eliminated " + agent2.getName() +
                        " with right-click shot (-" + totalDamage + " hp)";
            }

            return agent1.getName() + " hit " + agent2.getName() +
                    " with right-click shot (-" + totalDamage + " hp). Remaining HP: " +
                    agent2.getBaseLife();
        }
        else if (chance == 6){
            int totalDamage= bodyDamage+2*legsDamage;
            agent2.setBaseLife(agent2.getBaseLife() - totalDamage);

            if (agent2.getBaseLife() <= 0) {
                agent2.setBaseLife(0);
                agent2.isDeath();
                return agent1.getName() + " eliminated " + agent2.getName() +
                        " with right-click shot (-" + totalDamage + " hp)";
            }

            return agent1.getName() + " hit " + agent2.getName() +
                    " with right-click shot (-" + totalDamage + " hp). Remaining HP: " +
                    agent2.getBaseLife();
        }

            int totalDamage= 3*legsDamage;
            agent2.setBaseLife(agent2.getBaseLife() - totalDamage);

            if (agent2.getBaseLife() <= 0) {
                agent2.setBaseLife(0);
                agent2.isDeath();
                return agent1.getName() + " eliminated " + agent2.getName() +
                        " with right-click shot (-" + totalDamage + " hp)";
            }

            return agent1.getName() + " hit " + agent2.getName() +
                    " with right-click shot (-" + totalDamage + " hp). Remaining HP: " +
                    agent2.getBaseLife();

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Classic classic = (Classic) o;
        return headDamage == classic.headDamage && bodyDamage == classic.bodyDamage &&
                legsDamage == classic.legsDamage && rightclick == classic.rightclick;
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