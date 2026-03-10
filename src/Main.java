import ui.ShopWindow;
import Exceptions.*;
import valorantAgent.*;
import valorantArsenal.*;
import maps.*;
import javax.swing.*;

public class Main {
    void main(){

        Skill skillDash    = new Skill("Tailwind",    0,   false, Skill.Effect.DAMAGE);
        Skill skillBlade   = new Skill("Bladestorm",  7,   true,  Skill.Effect.DAMAGE);
        Skill skillHeal    = new Skill("Healing Orb", 100, false, Skill.Effect.HEALING);
        Skill skillBarrier = new Skill("Barrier Orb", 400, false, Skill.Effect.DAMAGE);

        Agent agent1 = new Agent("Jett",   "Korea", 100, true);
        Agent agent2 = new Agent("Phoenix", "UK",   100, true);

        System.out.println(agent1);
        System.out.println(agent2);

        Duelist duelist1 = new Duelist("Reyna", "Mexico",      100, true, skillDash,  skillBlade,   skillHeal,    skillBarrier);
        Duelist duelist2 = new Duelist("Neon",  "Philippines", 100, true, skillDash,  skillHeal,    skillBlade,   skillBarrier);

        System.out.println(duelist1);
        System.out.println(duelist2);

        Sentinel sentinel1 = new Sentinel("Sage",    "China",   100, true, skillHeal,    skillBarrier, skillDash,  skillBlade);
        Sentinel sentinel2 = new Sentinel("Killjoy", "Germany", 100, true, skillDash,    skillBlade,   skillHeal,  skillBarrier);

        System.out.println(sentinel1);
        System.out.println(sentinel2);

        Controller controller1 = new Controller("Omen",      "Unknown", 100, true, skillDash,    skillBlade,   skillHeal,    skillBarrier);
        Controller controller2 = new Controller("Brimstone", "USA",     100, true, skillHeal,    skillBarrier, skillDash,    skillBlade);

        System.out.println(controller1);
        System.out.println(controller2);

        AgentsTeam teamAlpha = new AgentsTeam();
        teamAlpha.setTeamName("Alpha");

        AgentsTeam teamBeta = new AgentsTeam();
        teamBeta.setTeamName("Beta");

        Agent[] alphaAgents = { agent1, agent2, duelist1, sentinel1, controller1 };
        for (Agent a : alphaAgents) {
            try {
                teamAlpha.addAgent(a);
            } catch (TeamFullException e) {
                System.out.println("ERROR Alpha: " + e.getMessage());
            }
        }

        Agent[] betaAgents = { duelist2, sentinel2, controller2, agent1, agent2 };
        for (Agent a : betaAgents) {
            try {
                teamBeta.addAgent(a);
            } catch (TeamFullException e) {
                System.out.println("ERROR Beta: " + e.getMessage());
            }
        }

        try {
            teamAlpha.addAgent(new Agent("Extra", "?", 100, true));
        } catch (TeamFullException e) {
            System.out.println("TeamFullException caught: " + e.getMessage());
        }

        System.out.println("Team Alpha agents: " + teamAlpha.getAgentsList().size());
        System.out.println("Team Beta agents: "  + teamBeta.getAgentsList().size());

        teamAlpha.assignAgentToMap("Ascent", agent1);
        teamAlpha.assignAgentToMap("Bind",   duelist1);
        teamBeta.assignAgentToMap("Haven",   sentinel2);
        teamBeta.assignAgentToMap("Pearl",   controller2);

        Agent deadAgent = new Agent("Ghost", "Unknown", 0, false);
        try {
            deadAgent.useSkill();
        } catch (DeadAgentException e) {
            System.out.println("DeadAgentException caught: " + e.getMessage());
        }

        for (Agent a : alphaAgents) {
            try {
                a.useSkill();
            } catch (DeadAgentException e) {
                System.out.println("DeadAgentException: " + e.getMessage());
            }
        }

        try {
            Agent found = teamAlpha.findAgentOrThrow("Sage");
            System.out.println("Found in Alpha: " + found.getName());
            teamAlpha.findAgentOrThrow("NonExistent");
        } catch (AgentNotFoundException e) {
            System.out.println("AgentNotFoundException caught: " + e.getMessage());
        }

        try {
            Agent found = teamBeta.findAgentOrThrow("Killjoy");
            System.out.println("Found in Beta: " + found.getName());
        } catch (AgentNotFoundException e) {
            System.out.println("AgentNotFoundException: " + e.getMessage());
        }

        Fusil vandal  = new Fusil("Vandal",  25, 2900.0, true,  Weapons.Penetration.HIGH,   160, 39, 33, false);
        Fusil phantom = new Fusil("Phantom", 30, 2900.0, true,  Weapons.Penetration.MEDIUM, 156, 38, 32, false);

        System.out.println(vandal);
        System.out.println(phantom);

        Pistol ghost   = new Pistol("Ghost",   15, 500.0, false, Weapons.Penetration.MEDIUM, 105, 30, 25, true);
        Pistol sheriff = new Pistol("Sheriff",  6, 800.0, false, Weapons.Penetration.HIGH,   160, 55, 46, false);

        System.out.println(ghost);
        System.out.println(sheriff);

        Sniper operator = new Sniper("Operator", 5, 4700.0, false, Weapons.Penetration.HIGH,   255, 150, Sniper.Scope.OPERATORMAX, 127);
        Sniper marshal  = new Sniper("Marshal",  5,  950.0, false, Weapons.Penetration.MEDIUM, 202, 101, Sniper.Scope.MARSHAL, 85);

        System.out.println(operator);
        System.out.println(marshal);

        Shotgun judge = new Shotgun("Judge", 7, 1850.0, true,  Weapons.Penetration.LOW, 175, 34, 29, 34, Shotgun.ShotgunName.JUDGE);
        Shotgun bucky = new Shotgun("Bucky", 5, 1100.0, false, Weapons.Penetration.LOW, 220, 34, 29, 50, Shotgun.ShotgunName.BUCKY);

        System.out.println(judge);
        System.out.println(bucky);

        Classic classic1 = new Classic("Classic", 12, 0.0, false, Weapons.Penetration.LOW, 78, 26, 22, true);
        Classic classic2 = new Classic("Classic", 12, 0.0, false, Weapons.Penetration.LOW, 78, 26, 22, false);

        System.out.println(classic1);
        System.out.println(classic2);

        Knife knife1 = new Knife("Knife", 1, 0.0, false, Weapons.Penetration.LOW, 50, 30, 75, 55);
        Knife knife2 = new Knife("Knife", 1, 0.0, false, Weapons.Penetration.LOW, 50, 30, 75, 55);

        System.out.println(knife1);
        System.out.println(knife2);

        Weapons[] allWeapons = { vandal, phantom, ghost, sheriff, operator, marshal, judge, bucky };
        for (Weapons w : allWeapons) {
            try {
                w.setPrice(-1);
            } catch (InvalidPriceException e) {
                System.out.println("InvalidPriceException [" + w.getName() + "]: " + e.getMessage());
            }
        }

        vandal.addSkin("Elderflame");
        vandal.addSkin("Prime");
        phantom.addSkin("Reaver");
        System.out.println("Vandal skin found: " + vandal.findSkin("Prime"));

        SiteMap siteMap1 = new SiteMap(10, 3, 5, 280.5);
        SiteMap siteMap2 = new SiteMap(8,  4, 2, 210.0);

        System.out.println(siteMap1);
        System.out.println(siteMap2);

        SpecialMap specialMap1 = new SpecialMap("Fracture", "USA",   true, 5, "Zipline",    true, 20.0, 3);
        SpecialMap specialMap2 = new SpecialMap("Lotus",    "India", true, 6, "RotateDoor", true, 15.0, 4);

        System.out.println(specialMap1);
        System.out.println(specialMap2);

        specialMap1.addZone("A Site");
        specialMap1.addZone("B Site");
        specialMap1.addZoneType("A Site", "Bomb");
        specialMap1.addZoneType("B Site", "Bomb");
        System.out.println("Zone type A Site: " + specialMap1.getZoneType("A Site"));
        System.out.println("Zone found: "       + specialMap1.findZone("B Site"));

        specialMap2.addZone("A Site");
        specialMap2.addZone("C Site");
        specialMap2.addZoneType("A Site", "Bomb");

        Agent attacker = new Agent("Jett",  "Korea",  100, true);
        Agent target   = new Agent("Reyna", "Mexico", 100, true);

        System.out.println(vandal.shoot(attacker, target));
        if (target.getisAlive()) {
            System.out.println(operator.shoot(attacker, target));
        }
        System.out.println(knife1.frontKnifing(attacker, target));
        System.out.println(Classic.shootLc(attacker, target));

        SwingUtilities.invokeLater(() -> new ShopWindow());
    }
}




