package Exercise_N3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {

    @Test
    void getPrice() {

        Apple apple = new Apple(157.0, 2.0);
        double result = 314;
        assertEquals(result, apple.getPrice());
    }
}