package org.example;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("🔧 Before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("🧪 Setting up test case...");
        calculator = new Calculator();  // Arrange
    }

    @AfterEach
    void tearDown() {
        System.out.println("✅ Finished test case.\n");
        calculator = null;
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("🧹 After all tests");
    }

    @Test
    void testAddition() {
        // Act
        int result = calculator.add(3, 7);

        // Assert
        assertEquals(10, result, "3 + 7 should be 10");
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(4, 5);
        assertEquals(20, result);
    }

    @Test
    void testDivision() {
        int result = calculator.divide(20, 4);
        assertEquals(5, result);
    }

    @Test
    void testDivideByZeroThrowsException() {
        Exception ex = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", ex.getMessage());
    }
}

