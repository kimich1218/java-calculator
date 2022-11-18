import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCodeTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, TestCode.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, TestCode.multiply(2, 2)),
                () -> assertEquals(-4, TestCode.multiply(2, -2)),
                () -> assertEquals(4, TestCode.multiply(-2, -2)),
                () -> assertEquals(0, TestCode.multiply(1, 0)));

    }
}