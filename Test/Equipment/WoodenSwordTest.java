package Equipment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WoodenSwordTest {
    Weapon testSword = new WoodenSword();

    @Test
    void getDmgBonus() {
        assertEquals(10, testSword.getDmgBonus());
    }

    @Test
    void getPartOfBody() {
        assertEquals("Right hand", testSword.getPartOfBody());
    }
}