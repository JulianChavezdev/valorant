package valorantArsenal;

import java.util.Objects;

public class Fusil extends Weapons{
    private int headDamage;
    private int bodyDamage;
    private int legsDamage;
    private boolean burst;

    public Fusil(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration, int headDamage, int bodyDamage, int legsDamage, boolean burst) {
        super(name, chargedsize, price, itsAutomatic, penetration);
        this.headDamage = headDamage;
        this.bodyDamage = bodyDamage;
        this.legsDamage = legsDamage;
        this.burst = burst;
    }

    public Fusil(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration) {
        super(name, chargedsize, price, itsAutomatic, penetration);
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

    public boolean isBurst() {
        return burst;
    }

    public void setBurst(boolean burst) {
        this.burst = burst;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fusil fusil = (Fusil) o;
        return headDamage == fusil.headDamage && bodyDamage == fusil.bodyDamage && legsDamage == fusil.legsDamage && burst == fusil.burst;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), headDamage, bodyDamage, legsDamage, burst);
    }

    @Override
    public String toString() {
        return "Fusil{" +
                "headDamage=" + headDamage +
                ", bodyDamage=" + bodyDamage +
                ", legsDamage=" + legsDamage +
                ", burst=" + burst +
                '}';
    }
}
