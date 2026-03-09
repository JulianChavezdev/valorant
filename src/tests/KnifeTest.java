package tests;

import valorantAgent.Agent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import valorantArsenal.Knife;
import valorantArsenal.Weapons;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {
    private Knife knife;
    private Agent agent1;
    private Agent agent2;

    @BeforeEach
    void setUp() {
        knife = new Knife("Classic Knife", 1, 0.0, false, Weapons.Penetration.LOW, 50, 30, 75, 55);
        agent1 = new Agent("Jett", "Korea", 100, true);
        agent2 = new Agent("Reyna", "Mexico", 100, true);
    }

    @Test
    void testFrontKnifingMessage() {
        String result = knife.frontKnifing(agent1, agent2);
        assertTrue(result.contains("50"));
        assertTrue(result.contains("Knife"));
    }

    @Test
    void testEqualsTrue() {
        Knife knife2 = new Knife("Classic Knife", 1, 0.0, false, Weapons.Penetration.LOW, 50, 30, 75, 55);
        assertEquals(knife, knife2);
    }

    @Test
    void testSetPriceNegativeThrowsException() {
        assertThrows(Exception.class, () -> knife.setPrice(-100));
    }

    @Test
    void testDeadAgentThrowsExceptionOnSkill() {
        Agent deadAgent = new Agent("Sage", "China", 0, false);
        assertThrows(Exception.class, () -> deadAgent.useSkill());
    }

}
