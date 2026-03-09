package tests;

import valorantAgent.Agent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import valorantArsenal.Shotgun;
import valorantArsenal.Weapons;

import static org.junit.jupiter.api.Assertions.*;

class ShotgunTest {

    private Shotgun shotgun;
    private Agent agent1;
    private Agent agent2;

    @BeforeEach
    void setUp() {
        shotgun = new Shotgun("Judge", 7, 1850.0, true, Weapons.Penetration.LOW,
                175, 34, 29, 34, Shotgun.ShotgunName.JUDGE);
        agent1 = new Agent("Jett", "Korea", 100, true);
        agent2 = new Agent("Reyna", "Mexico", 100, true);
    }


    @Test
    void testDamageValues() {
        assertEquals(175, shotgun.getHeadDamage());
        assertEquals(34, shotgun.getBodyDamage());
        assertEquals(29, shotgun.getLegsDamage());
    }


    @Test
    void testShootReducesHealth() {
        int initialLife = agent2.getBaseLife();
        shotgun.shoot(agent1, agent2);
        assertTrue(agent2.getBaseLife() < initialLife);
    }


    @Test
    void testShootKillsAgentWhenLifeReachesZero() {
        agent2.setBaseLife(1); // casi muerto
        shotgun.shoot(agent1, agent2);
        assertFalse(agent2.isAlive());
        assertEquals(0, agent2.getBaseLife());
    }


    @Test
    void testEqualsDifferentShotgunName() {
        Shotgun differentShotgun = new Shotgun("Bucky", 5, 1850.0, true, Weapons.Penetration.LOW,
                175, 34, 29, 34, Shotgun.ShotgunName.BUCKY);
        assertNotEquals(shotgun, differentShotgun);
    }


    @Test
    void testSetPriceNegativeThrowsException() {
        assertThrows(Exception.class, () -> shotgun.setPrice(-500));
    }
}