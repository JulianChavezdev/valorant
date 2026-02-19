package valorantArsenal;

import java.util.Objects;

public class Shotgun extends Weapons{
    private int headDamage;
    private int bodyDamage;
    private int legsDamage;
    private int rightclickdamage;
    public enum ShotgunName {SHORTY, BUCKY, JUDGE};
    private ShotgunName shotgunName;

    public Shotgun(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration, int headDamage, int bodyDamage, int legsDamage, int rightclickdamage, ShotgunName shotgunName) {
        super(name, chargedsize, price, itsAutomatic, penetration);
        this.headDamage = headDamage;
        this.bodyDamage = bodyDamage;
        this.legsDamage = legsDamage;
        this.rightclickdamage = rightclickdamage;
        this.shotgunName = shotgunName;
    }

    public Shotgun(String name, int chargedsize, double price, boolean itsAutomatic, Category category) {
        super(name, chargedsize, price, itsAutomatic, category);
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

    public int getRightclickdamage() {
        return rightclickdamage;
    }

    public void setRightclickdamage(int rightclickdamage) {
        this.rightclickdamage = rightclickdamage;
    }

    public ShotgunName getShotgunName() {
        return shotgunName;
    }

    public void setShotgunName(ShotgunName shotgunName) {
        this.shotgunName = shotgunName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shotgun shotgun = (Shotgun) o;
        return headDamage == shotgun.headDamage && bodyDamage == shotgun.bodyDamage && legsDamage == shotgun.legsDamage && rightclickdamage == shotgun.rightclickdamage && shotgunName == shotgun.shotgunName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), headDamage, bodyDamage, legsDamage, rightclickdamage, shotgunName);
    }

    @Override
    public String toString() {
        return "Shotgun{" +
                "headDamage=" + headDamage +
                ", bodyDamage=" + bodyDamage +
                ", legsDamage=" + legsDamage +
                ", rightclickdamage=" + rightclickdamage +
                ", shotgunName=" + shotgunName +
                '}';
    }
}

