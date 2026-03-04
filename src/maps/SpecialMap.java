package maps;

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
}
