package Enemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {
    Enemy testBoss = new Boss();

    @Test
    void specialMove() {
        assertEquals("The Undead King intimidates you with their presence", testBoss.SpecialMove());
    }
}