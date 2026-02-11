package valorantAgent;

import java.util.Objects;

public class Skill extends Agent{
    private String name;
    private int price;
    private boolean itsulti;
    private enum Effect{DAÑO,CURACION,CEGUERA};
    private Effect effect;

    public Skill(String name, String country, int baseLife, boolean itslive, String name1, int price, boolean ulti, Effect effect) {
        super(name, country, baseLife, itslive);
        this.name = name1;
        this.price = price;
        this.itsulti = ulti;
        this.effect = effect;
    }

    public Skill(String name, int price, boolean ulti, Effect effect) {
        this.name = name;
        this.price = price;
        this.itsulti = ulti;
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

