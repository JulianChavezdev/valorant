package valorantArsenal;

import java.util.Objects;

public class Classic extends Weapons {
    private int headDamage;
    private int bodyDamage;
    private int legsDamage;
    private boolean rightclick;

    public Classic(String name, int chargedsize, double price, boolean itsAutomatic, Category category, int headDamage, int bodyDamage, int legsDamage, boolean rightclick) {
        super(name, chargedsize, price, itsAutomatic, category);
        this.headDamage = headDamage;
        this.bodyDamage = bodyDamage;
        this.legsDamage = legsDamage;
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

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), headDamage, bodyDamage, legsDamage, rightclick);
    }
}
