package valorantArsenal;

import java.util.Objects;

public class Weapons {
    private String name;
    private double price;
    private boolean itsAutomatic;
    protected enum Category {PISTOLA, FRANCOTIRADOR, FUSIL}
    private Category category;

    public Weapons(String name, double price, boolean itsAutomatic, Category category) {
        this.name = name;
        this.price = price;
        this.itsAutomatic = itsAutomatic;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Weapons arma = (Weapons) o;
        return Double.compare(price, arma.price) == 0 && itsAutomatic == arma.itsAutomatic && Objects.equals(name, arma.name) && category == arma.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, itsAutomatic, category);
    }
}
