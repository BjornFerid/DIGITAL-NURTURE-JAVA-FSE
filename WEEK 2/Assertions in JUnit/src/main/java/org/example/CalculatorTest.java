package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(7, calc.add(3, 4), "3 + 4 should be 7");
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calc.subtract(10, 5), "10 - 5 should be 5");
    }

    @Test
    void testIsPositive() {
        assertTrue(calc.isPositive(10), "10 is positive");
        assertFalse(calc.isPositive(-1), "-1 is not positive");
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });

        assertEquals("Division by zero not allowed", exception.getMessage());
    }

    @Test
    void testAllTogether() {
        assertAll("Multiple operations",
                () -> assertEquals(9, calc.add(4, 5)),
                () -> assertEquals(1, calc.subtract(6, 5)),
                () -> assertTrue(calc.isPositive(3))
        );
    }
}
