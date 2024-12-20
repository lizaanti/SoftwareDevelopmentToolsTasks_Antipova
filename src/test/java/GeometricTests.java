
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OctagonTest {

    @Test
    void testArea() {
        Octagon octagon = new Octagon(5);
        double expectedArea = (2 + 4 / Math.sqrt(2)) * 5 * 5;
        assertEquals(expectedArea, octagon.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        Octagon octagon = new Octagon(5);
        assertEquals(40, octagon.getPerimeter(), 0.0001);
    }

    @Test
    void testClone() {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = octagon1.clone();
        assertEquals(octagon1.getArea(), octagon2.getArea(), 0.0001);
        assertNotSame(octagon1, octagon2);
    }

    @Test
    void testCompareTo() {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = new Octagon(6);
        assertTrue(octagon1.compareTo(octagon2) < 0);
    }

    @Test
    void testEquals() {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = new Octagon(5);
        assertEquals(octagon1, octagon2);
    }
}
