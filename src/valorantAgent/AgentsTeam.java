package valorantAgent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class AgentsTeam extends Agent {
    private String teamName;
    private ArrayList<Agent> agentsList = new ArrayList<>();
    private HashMap<String, Agent> agentByMap = new HashMap<>();
    private int victories;


    public AgentsTeam(String name, String country, int baseLife, boolean isAlive) {
        super(name, country, baseLife, isAlive);
    }

    public AgentsTeam() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Agent> getAgentsList() {
        return agentsList;
    }

    public void setAgentsList(ArrayList<Agent> agentsList) {
        this.agentsList = agentsList;
    }

    public HashMap<String, Agent> getAgentByMap() {
        return agentByMap;
    }

    public void setAgentByMap(HashMap<String, Agent> agentByMap) {
        this.agentByMap = agentByMap;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public Agent getAgent(String name) {
        if (agentByMap.containsKey(name)) {
            return agentByMap.get(name);
        } else {
            return null;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AgentsTeam that = (AgentsTeam) o;
        return victories == that.victories && Objects.equals(teamName, that.teamName) && Objects.equals(agentsList, that.agentsList) && Objects.equals(agentByMap, that.agentByMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teamName, agentsList, agentByMap, victories);
    }


    public void addAgent(Agent agent) {
        agentsList.add(agent);
    }
    public void removeAgent(Agent agent) {
        agentsList.remove(agent);
    }
    public Agent findAgent(String name) {
        for (Agent a : agentsList) {
            if (a.getName().equals(name)) return a;
        }
        return null;
    }


    public void assignAgentToMap(String mapName, Agent agent) {
        agentByMap.put(mapName, agent);
    }
    public void removeAgentFromMap(String mapName) {
        agentByMap.remove(mapName);
    }


    @Override
    public String toString() {
        return "AgentsTeam{" +
                "teamName='" + teamName + '\'' +
                ", agentsList=" + agentsList +
                ", agentByMap=" + agentByMap +
                ", victories=" + victories +
                '}';
    }
}

