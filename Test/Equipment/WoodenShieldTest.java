package Equipment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WoodenShieldTest {
    Armor testShield = new WoodenShield();

    @Test
    void getName() {
        assertEquals("WoodenShield", testShield.getName());
    }

    @Test
    void getDef_Bonus() {
        assertEquals(5, testShield.getDef_Bonus());
    }

    @Test
    void getPartOfBody() {
        assertEquals("Left hand", testShield.getPartOfBody());
    }
}