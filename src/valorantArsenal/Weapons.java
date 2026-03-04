package valorantArsenal;

import java.util.Objects;

public class Weapons {
    private String name;
    private int chargedsize;
    private double price;
    private boolean itsAutomatic;
    public enum Penetration {HIGH, MEDIUM, LOW}
    protected Penetration penetration;


    public Weapons(String name, int chargedsize, double price, boolean itsAutomatic, Penetration penetration) {
        this.name = name;
        this.chargedsize = chargedsize;
        this.price = price;
        this.itsAutomatic = itsAutomatic;
        this.penetration = penetration;
    }

    public Weapons() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isItsAutomatic() {
        return itsAutomatic;
    }

    public void setItsAutomatic(boolean itsAutomatic) {
        this.itsAutomatic = itsAutomatic;
    }

    public Penetration getCategory() {
        return penetration;
    }

    public void setCategory(Penetration category) {
        this.penetration = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Weapons arma = (Weapons) o;
        return Double.compare(price, arma.price) == 0 && itsAutomatic == arma.itsAutomatic && Objects.equals(name, arma.name) && penetration == arma.penetration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, itsAutomatic, penetration);
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "name='" + name + '\'' +
                ", chargedsize=" + chargedsize +
                ", price=" + price +
                ", itsAutomatic=" + itsAutomatic +
                ", category=" + penetration +
                '}';
    }
}

