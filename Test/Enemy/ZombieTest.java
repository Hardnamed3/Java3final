package Enemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZombieTest {
    Enemy testZombie = new Zombie();

    @Test
    void specialMove() {
        assertEquals("The Zombie drools on you", testZombie.SpecialMove());
    }
}