package valorantAgent;

import Exceptions.DeadAgentException;

import java.util.ArrayList;
import java.util.Objects;

public class Agent {
    private String name;
    private String country;
    private int baseLife;
    private boolean isAlive;
    private ArrayList<String> matchHistory = new ArrayList<>();

    public Agent(String name, String country, int baseLife, boolean isAlive) {
        this.name = name;
        this.country = country;
        this.baseLife = 100;
        this.isAlive = true;
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

    public boolean getisAlive() {
        return isAlive;
    }

    public void setisAlive(boolean itslive) {
        isAlive = itslive;
    }

    public void addMatch(String result) {
        matchHistory.add(result);
    }

    public void removeMatch(String result) {
        matchHistory.remove(result);
    }

    public void useSkill() throws DeadAgentException {
        if (!isAlive) throw new DeadAgentException(name);
        System.out.println(name + " uses a skill");
    }
    public void isDeath(){
        if (getBaseLife()<=0){
            setisAlive(isAlive=false);
            System.out.println(isAlive);
        }
        setisAlive(isAlive=true);
        System.out.println(isAlive);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Agent agent = (Agent) o;
        return baseLife == agent.baseLife && isAlive == agent.isAlive && Objects.equals(name, agent.name) && Objects.equals(country, agent.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, baseLife, isAlive);
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", baseLife=" + baseLife +
                ", isAlive=" + isAlive +
                '}';
    }


}

