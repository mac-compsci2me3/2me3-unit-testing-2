
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestCalculator {

    @Test
    public void whenAddingTwoNumbers_thenCorrect() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

}
