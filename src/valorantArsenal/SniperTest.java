package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import valorantAgent.Agent;
import valorantArsenal.Sniper;
import valorantArsenal.Weapons;

import static org.junit.jupiter.api.Assertions.*;

class SniperTest {
    private Sniper operator;
    private Agent shooter;
    private Agent target;

    @BeforeEach
    void setUp() {
        operator = new Sniper("Operator", 5, 4700.0, false, Weapons.Penetration.HIGH, 255, 120, Sniper.Scope.OPERATORMIN, 150);
        shooter = new Agent("Jett", "Korea", 100, true);
        target = new Agent("Raze", "Brasil", 100, true);
    }

    @Test
    void testSetScope() {
        operator.setScope(true);
        assertTrue(operator.isScoped(), "The sniper should be in scoped mode");

        operator.setScope(false);
        assertFalse(operator.isScoped(), "The sniper should be in hip-fire mode");
    }

    @Test
    void testShootElimination() {
        String result = operator.shoot(shooter, target);

        assertEquals(0, target.getBaseLife(), "Target should have 0 HP after a sniper shot");
        assertFalse(target.isAlive(), "Target should be eliminated");
        assertTrue(result.contains("eliminated"), "The combat log should confirm the kill");
    }

    @Test
    void testEquals() {
        Sniper sameSniper = new Sniper("Operator", 5, 4700.0, false, null, 255, 150, 120, false);
        Sniper differentSniper = new Sniper("Marshal", 5, 950.0, false, null, 202, 101, 85, false);

        assertEquals(operator, sameSniper, "Identical snipers should be equal");
        assertNotEquals(operator, differentSniper, "Different sniper models should not be equal");
    }

    @Test
    void testHashCode() {
        Sniper sameSniper = new Sniper("Operator", 5, 4700.0, false, null, 255, 150, 120, false);
        assertEquals(operator.hashCode(), sameSniper.hashCode(), "HashCodes must match for identical objects");
    }

    @Test
    void testToString() {
        String info = operator.toString();
        assertTrue(info.contains("Operator"), "ToString should include the weapon name");
        assertTrue(info.contains("255"), "ToString should include the headshot damage");
    }
}