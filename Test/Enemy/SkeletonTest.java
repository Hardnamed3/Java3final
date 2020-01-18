package Enemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkeletonTest {
    Enemy testSkeleton = new Skeleton();

    @Test
    void specialMove() {
        assertEquals("The Skeleton rattles its bones at you", testSkeleton.SpecialMove());
    }
}