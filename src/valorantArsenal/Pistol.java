package valorantArsenal;

import java.util.Objects;

public class Pistol extends Weapons {
    private int headDamage;
    private int bodyDamage;
    private int legsDamage;
    private boolean itsSilenced;

    public Pistol(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration, int headDamage, int bodyDamage, int legsDamage, boolean itsSilenced) {
        super(name, chargedsize, price, itsAutomatic, penetration);
        this.headDamage = headDamage;
        this.bodyDamage = bodyDamage;
        this.legsDamage = legsDamage;
        this.itsSilenced = itsSilenced;
    }

    public Pistol() {
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

    public boolean isItsSilenced() {
        return itsSilenced;
    }

    public void setItsSilenced(boolean itsSilenced) {
        this.itsSilenced = itsSilenced;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pistol pistol = (Pistol) o;
        return headDamage == pistol.headDamage && bodyDamage == pistol.bodyDamage && legsDamage == pistol.legsDamage && itsSilenced == pistol.itsSilenced;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), headDamage, bodyDamage, legsDamage, itsSilenced);
    }

    @Override
    public String toString() {
        return "Pistol{" +
                "headDamage=" + headDamage +
                ", bodyDamage=" + bodyDamage +
                ", legsDamage=" + legsDamage +
                ", itsSilenced=" + itsSilenced +
                '}';
    }
}

