import ui.ShopWindow;
import Exceptions.*;
import valorantAgent.*;
import valorantArsenal.*;
import maps.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Agent agent1 = new Agent("Jett", "Korea", 100, true);
        Agent agent2 = new Agent("Phoenix", "UK", 100, false);
        AgentsTeam team = new AgentsTeam();
        team.setTeamName("Alpha");


        Agent[] agents = {agent1, agent2,
                new Duelist("Reyna","Mexico",100,true,null,null,null,null),
                new Sentinel("Sage","China",100,true,null,null,null,null),
                new Controller("Omen","Unknown",100,true,null,null,null,null)
        };
        for (Agent a : agents) {
            try {
                team.addAgent(a);
            } catch (TeamFullException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        try {
            team.addAgent(new Agent("Extra","?",100,true));
        } catch (TeamFullException e) {
            System.out.println("TeamFullException caught: " + e.getMessage());
        }


        for (Agent a : agents) {
            try {
                a.useSkill();
            } catch (DeadAgentException e) {
                System.out.println("DeadAgentException: " + e.getMessage());
            }
        }


        try {
            Agent found = team.findAgentOrThrow("Sage");
            System.out.println("Found: " + found.getName());
            team.findAgentOrThrow("NonExistent"); // negativo
        } catch (AgentNotFoundException e) {
            System.out.println("AgentNotFoundException: " + e.getMessage());
        }


        Weapons[] weapons = {
                new Fusil("Vandal",25,2900,true,Weapons.Penetration.HIGH,160,39,33,false),
                new Pistol("Ghost",15,500,false,Weapons.Penetration.MEDIUM,105,30,25,true)
        };
        for (Weapons w : weapons) {
            try {
                w.setPrice(-1);
            } catch (InvalidPriceException e) {
                System.out.println("InvalidPriceException: " + e.getMessage());
            }
        }


        SiteMap sm = new SiteMap(10, 3, 5, 280.5);
        SpecialMap spm = new SpecialMap("Fracture","USA",true,5,"Zipline",true,20.0,3);


        SwingUtilities.invokeLater(() -> new ShopWindow());
    }
}