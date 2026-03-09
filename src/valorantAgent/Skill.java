package valorantAgent;

import java.util.Objects;

public class Skill{
    private String name;
    private int price;
    private boolean itsulti;
    public enum Effect{DAMAGE, HEALING, BLINDNESS};
    private Effect effect;

    public Skill(String name, int price, boolean itsulti, Effect effect) {
        this.name = name;
        this.price = price;
        this.itsulti = itsulti;
        this.effect = effect;
    }

    public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isItsulti() {
        return itsulti;
    }

    public void setItsulti(boolean itsulti) {
        this.itsulti = itsulti;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Skill skill = (Skill) o;
        return price == skill.price && itsulti == skill.itsulti && Objects.equals(name, skill.name) && effect == skill.effect;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, price, itsulti, effect);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ulti=" + itsulti +
                ", effect=" + effect +
                '}';
    }
}

