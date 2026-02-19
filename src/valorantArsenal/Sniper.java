package valorantArsenal;

import java.util.Objects;

public class Sniper extends Weapons {
    private int headDamage;
    private int bodyDamage;
    private int legsDamage;
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

}
