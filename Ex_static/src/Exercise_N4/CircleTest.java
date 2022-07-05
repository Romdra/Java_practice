package Exercise_N4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void areaCircle() {
        Circle circle = new Circle(5.0);
        double result = 78;
        assertEquals(result, circle.areaCircle());
    }

    @Test
    void circumference() {
        Circle circle = new Circle(5.0);
        double result = 31;
        assertEquals(result, circle.circumference());
    }
}