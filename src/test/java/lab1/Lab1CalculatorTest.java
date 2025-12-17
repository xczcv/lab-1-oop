package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab1CalculatorTest {

    @Test
    void smallCase_isCorrect() {

        assertEquals(0.65, Lab1Calculator.calculate(4, 5), 1e-12);
    }

    @Test
    void n10_m10_isCorrect() {
        assertEquals(5.594083694083691, Lab1Calculator.calculate(10, 10), 1e-12);
    }

    @Test
    void invalidInputs_throw() {
        assertThrows(IllegalArgumentException.class, () -> Lab1Calculator.calculate(1, 10));
        assertThrows(IllegalArgumentException.class, () -> Lab1Calculator.calculate(10, 2));
    }
}
