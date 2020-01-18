package Equipment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeatherArmorTest {
    Armor testArmor = new LeatherArmor();

    @Test
    void getName() {
        assertEquals("Leather Armor", testArmor.getName());
    }

    @Test
    void getDef_Bonus() {
        assertEquals(3, testArmor.getDef_Bonus());
    }

    @Test
    void getPartOfBody() {
        assertEquals("Armor", testArmor.getPartOfBody());
    }
}