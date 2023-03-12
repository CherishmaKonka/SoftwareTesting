import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.add(2, 3);
        assertEquals(expected, actual);
    }
}
