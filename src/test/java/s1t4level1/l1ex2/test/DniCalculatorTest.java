package s1t4level1.l1ex2.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import s1t4level1.l1ex2.src.DniCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DniCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X"
    })

    void testCalculateDniLetter(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, DniCalculator.calculateDniLetter(dniNumber));
    }
}