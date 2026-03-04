package valorantAgent;

import java.util.Objects;

public class Agent {
    private String name;
    private String country;
    private int baseLife;
    private boolean Itslive;

    public Agent(String name, String country, int baseLife, boolean itslive) {
        this.name = name;
        this.country = country;
        this.baseLife = baseLife;
        Itslive = itslive;
    }

    public Agent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBaseLife() {
        return baseLife;
    }

    public void setBaseLife(int baseLife) {
        this.baseLife = baseLife;
    }

    public boolean isItslive() {
        return Itslive;
    }

    public void setItslive(boolean itslive) {
        Itslive = itslive;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Agent agent = (Agent) o;
        return baseLife == agent.baseLife && Itslive == agent.Itslive && Objects.equals(name, agent.name) && Objects.equals(country, agent.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, baseLife, Itslive);
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", baseLife=" + baseLife +
                ", Itslive=" + Itslive +
                '}';
    }


}

