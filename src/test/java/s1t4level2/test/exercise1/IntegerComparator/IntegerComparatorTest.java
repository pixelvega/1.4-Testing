// Ejercicio 1: Test de igualdad y desigualdad de valores entre enteros

package s1t4level2.test.exercise1.IntegerComparator;
import org.junit.jupiter.api.Test;
import s1t4level2.src.exercise1.IntegerComparator;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerComparatorTest {

    @Test
    void testIntegersAreEqual() {
        IntegerComparator first = new IntegerComparator(5);
        IntegerComparator second = new IntegerComparator(5);

        assertThat(first.getValue()).isEqualTo(second.getValue());
    }

    @Test
    void testIntegersAreNotEqual() {
        IntegerComparator first = new IntegerComparator(5);
        IntegerComparator second = new IntegerComparator(10);

        assertThat(first.getValue()).isNotEqualTo(second.getValue());
    }
}
