package valorantAgentes;

public class Agente {
    private String nombre;
    private String pais;
    private int vidaBase;
    private boolean estaVivo;

    public Agente(String nombre, String pais, int vidaBase, boolean estaVivo) {
        this.nombre = nombre;
        this.pais = pais;
        this.vidaBase = vidaBase;
        this.estaVivo = estaVivo;
    }

    public Agente() {
    }
}