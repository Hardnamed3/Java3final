import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsTest {
    Stats testStats = new Stats();

    @BeforeEach
    void init(){
        testStats.setATK(10);
        testStats.setDEF(12);
        testStats.setHP(14);
    }

    @Test
    void getHP() {
        assertEquals(14, testStats.getHP());
    }

    @Test
    void getATK() {
        assertEquals(10, testStats.getATK());
    }

    @Test
    void getDEF() {
        assertEquals(12, testStats.getDEF());
    }
}