package valorantArsenal;

import Exceptions.InvalidPriceException;

import java.util.ArrayList;
import java.util.Objects;

public class Weapons {
    private String name;
    private int chargedsize;
    private double price;
    private boolean itsAutomatic;
    public enum Penetration {HIGH, MEDIUM, LOW}
    protected Penetration penetration;
    private ArrayList<String> skins = new ArrayList<>();


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

    public int getChargedsize() {
        return chargedsize;
    }
    public void setChargedsize(int chargedsize) {
        this.chargedsize = chargedsize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidPriceException {
        if (price < 0) throw new InvalidPriceException(price);
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

    public void addSkin(String skin) {
        skins.add(skin);
    }
    public void removeSkin(String skin) {
        skins.remove(skin);
    }
    public String findSkin(String skin) {
        for (String s : skins) {
            if (s.equalsIgnoreCase(skin)) return s;
        }
        return null;
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

