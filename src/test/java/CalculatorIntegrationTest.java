import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorIntegrationTest {

    @Test
    public void testCalculatorOperations() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        int expectedAdd = 8;
        int actualAdd = calculator.add(a, b);
        assertEquals(expectedAdd, actualAdd);

        int expectedSubtract = 2;
        int actualSubtract = calculator.subtract(a, b);
        assertEquals(expectedSubtract, actualSubtract);

        int expectedMultiply = 15;
        int actualMultiply = calculator.multiply(a, b);
        assertEquals(expectedMultiply, actualMultiply);

        int expectedDivide = 1;
        int actualDivide = calculator.divide(a, b);
        assertEquals(expectedDivide, actualDivide);
    }
}
