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
}
