package maps;

import java.util.Objects;

public class SpecialMap extends Map {
    private String uniqueMechanic;
    private boolean interactive;
    private double maxHeight;
    private int complexity;

    public SpecialMap() {}

    public SpecialMap(String name, String location, boolean comp, int pts, String mec, boolean inter, double height, int complexity) {
        super(name, location, comp, pts);
        this.uniqueMechanic = mec;
        this.interactive = inter;
        this.maxHeight = height;
        this.complexity = complexity;
    }

    public String getUniqueMechanic() {
        return uniqueMechanic;
    }

    public void setUniqueMechanic(String uniqueMechanic) {
        this.uniqueMechanic = uniqueMechanic;
    }

    public boolean isInteractive() {
        return interactive;
    }

    public void setInteractive(boolean interactive) {
        this.interactive = interactive;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SpecialMap that = (SpecialMap) o;
        return interactive == that.interactive && Double.compare(maxHeight, that.maxHeight) == 0 && complexity == that.complexity && Objects.equals(uniqueMechanic, that.uniqueMechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueMechanic, interactive, maxHeight, complexity);
    }

    @Override
    public String toString() {
        return "SpecialMap{" +
                "uniqueMechanic='" + uniqueMechanic + '\'' +
                ", interactive=" + interactive +
                ", maxHeight=" + maxHeight +
                ", complexity=" + complexity +
                '}';
    }
}
