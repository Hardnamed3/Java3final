import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player testPlayer = new Player();

    @BeforeEach
    void init(){
        testPlayer.setName("Bob");
        testPlayer.setStats(10,11,12);
    }


    @Test
    void getName() {
        assertEquals("Bob", testPlayer.getName());
    }
}