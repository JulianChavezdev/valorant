package valorantAgent;

import java.util.Objects;

public class Skill extends Agent{
    private String name;
    private int price;
    private boolean itsulti;
    private enum Efect{DAÑO,CURACION,CEGUERA};
    private Efect efect;

    public Skill(String name, String country, int baseLife, boolean itslive, String name1, int price, boolean ulti, Efect efect) {
        super(name, country, baseLife, itslive);
        this.name = name1;
        this.price = price;
        this.itsulti = ulti;
        this.efect = efect;
    }

    public Skill(String name, int price, boolean ulti, Efect efect) {
        this.name = name;
        this.price = price;
        this.itsulti = ulti;
        this.efect = efect;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Skill skill = (Skill) o;
        return price == skill.price && itsulti == skill.itsulti && Objects.equals(name, skill.name) && efect == skill.efect;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, price, itsulti, efect);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ulti=" + itsulti +
                ", efect=" + efect +
                '}';
    }
}

