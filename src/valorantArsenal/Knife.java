package valorantArsenal;

public class Knife extends Weapons {
    private int frontDamageLc;
    private int frontDamageRc;
    private int backDamageLc;
    private int backDamageRc;

    public Knife(String name, int chargedsize, double price, boolean itsAutomatic, Category category, int bodyDamageLc, int bodyDamageRc, int headDamageLc, int headDamageRc) {
        super(name, chargedsize, price, itsAutomatic, category);
        this.frontDamageLc = bodyDamageLc;
        this.frontDamageRc = bodyDamageRc;
        this.backDamageLc = headDamageLc;
        this.backDamageRc = headDamageRc;
    }

    public Knife() {
    }

    public int getFrontDamageLc() {
        return frontDamageLc;
    }

    public void setFrontDamageLc(int frontDamageLc) {
        this.frontDamageLc = frontDamageLc;
    }

    public int getFrontDamageRc() {
        return frontDamageRc;
    }

    public void setFrontDamageRc(int frontDamageRc) {
        this.frontDamageRc = frontDamageRc;
    }

    public int getBackDamageLc() {
        return backDamageLc;
    }

    public void setBackDamageLc(int backDamageLc) {
        this.backDamageLc = backDamageLc;
    }

    public int getBackDamageRc() {
        return backDamageRc;
    }

    public void setBackDamageRc(int backDamageRc) {
        this.backDamageRc = backDamageRc;
    }
    //Aqui los agentes seran de la clase agentes pondremos un if para el daño si es de leftclic o rightclic
    public String frontKnifing(int agente1, int agente2){
        return "(Agent1) Le ha quidado (cantidad de vida) a (Agent2)";
    }
    //Aqui los agentes seran de la clase agentes, pondremos un if para el daño si es de leftclic o rightclic
    public String backKnifing(int agente1, int agente2){
        return "(Agent1) Le ha quidado (cantidad de vida) a (Agent2)";
    }
}
