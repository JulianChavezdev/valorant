package maps;

public class SiteMap extends Map {
    private String mainSite;
    private int numberOfOrbs;

    public SiteMap() { super(); }

    public SiteMap(String name, String location, boolean comp, int pts, String mainSite, int numberOfOrbs) {
        super(name, location, comp, pts);
        this.mainSite = mainSite;
        this.numberOfOrbs = numberOfOrbs;
    }

    @Override
    public String toString() {
        return "Site " + mainSite + " on " + mapName;
    }
}