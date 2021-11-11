package mta.industry.skills.testing.unit.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorTest {

    private Calculator calculatorUnderTest;

    @BeforeEach
    public void setup() {
        calculatorUnderTest = new Calculator();
    }

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        assertEquals(2, calculatorUnderTest.add(1, 1), "1 + 1 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        assertEquals(expectedResult, calculatorUnderTest.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} X {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   2",
            "10,  51, 510",
            "-1,  8, -8",
            "-2,  -24, 48",
    })
    void testTimes(int first, int second, int expectedResult) {
        assertEquals(expectedResult, calculatorUnderTest.times(first, second),
                () -> first + " X " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Tests for divide options")
    void testDivide() {

        // happy path
        int result = calculatorUnderTest.divide(4, 2);
        assertEquals(2, result);

        // test the branch
        try {
            result = calculatorUnderTest.divide(4, 0);
            fail("We are expecting to fail with exception on that one, but from some reason didn't !");
        } catch (IllegalArgumentException e) {
            // all is ok
        } catch (Exception e) {
            fail("We are expecting to fail with IllegalArgumentException on that one, but from some reason we faile with: " + e.getMessage());
        }

    }
}
