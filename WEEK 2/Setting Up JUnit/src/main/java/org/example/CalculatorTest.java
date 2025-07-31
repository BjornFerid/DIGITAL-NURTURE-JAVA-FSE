package org.example;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");
    }
}