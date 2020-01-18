package Enemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Enemy testDog = new Dog();

    @Test
    void specialMove() {
        assertEquals("The Wild Dog barks at you", testDog.SpecialMove());
    }
}