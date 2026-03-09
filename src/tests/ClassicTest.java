package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import valorantAgent.Agent;
import valorantArsenal.Classic;
import static org.junit.jupiter.api.Assertions.*;

class ClassicTest {
    private Classic classic;
    private Agent shooter;
    private Agent target;

    @BeforeEach
    void setUp() {
        // Configuring Classic: 78 head, 26 body, 22 legs
        classic = new Classic("Classic", 12, 0.0, false, null, 78, 26, 22, true);
        shooter = new Agent("Jett", "Korea", 100, true);
        target = new Agent("Raze", "Brasil", 100, true);
    }

    @Test
    void testShootLcReducesHealth() {
        // Test 1: Check that left-click always reduces health
        Classic.shootLc(shooter, target);
        assertTrue(target.getBaseLife() < 100, "Health should have decreased after the primary shot");
    }

    @Test
    void testShootRcMultiplePellets() {
        // Test 2: Check that right-click (3 pellets) works
        // Even with minimum damage (3 * 22 = 66), health should drop significantly
        classic.shootRc(shooter, target);
        assertTrue(target.getBaseLife() <= 34, "Right-click should deal massive damage (minimum 66)");
    }

    @Test
    void testEliminationLogic() {
        // Test 3: Verify that the agent dies correctly when reaching 0 HP
        target.setBaseLife(10); // Low health to ensure elimination
        String message = Classic.shootLc(shooter, target);

        assertEquals(0, target.getBaseLife(), "Health must be exactly 0");
        assertFalse(target.isAlive(), "Agent should be marked as dead (isAlive = false)");
        assertTrue(message.contains("eliminated"), "Message should indicate elimination");
    }

    @Test
    void testToStringFormat() {
        // Test 4: Verify that the toString method displays the damage correctly
        String info = classic.toString();
        assertTrue(info.contains("headDamage=78"), "toString must include head damage");
        assertTrue(info.contains("rightclick=true"), "toString must show right-click status");
    }

    @Test
    void testEqualsAndHashCode() {
        // Test 5: Verify comparison logic between objects
        Classic sameClassic = new Classic("Classic", 12, 0.0, false, null, 78, 26, 22, true);
        Classic differentClassic = new Classic("Classic", 12, 0.0, false, null, 50, 10, 5, true);

        assertEquals(classic, sameClassic, "Two Classics with the same stats must be equal");
        assertEquals(classic.hashCode(), sameClassic.hashCode(), "HashCode must match for equal objects");
    }
}