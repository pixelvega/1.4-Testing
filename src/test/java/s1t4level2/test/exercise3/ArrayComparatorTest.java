// Ejercicio 3: Test de identidad de arrays de enteros
package s1t4level2.test.exercise3;
import org.junit.jupiter.api.Test;
import s1t4level2.src.exercise3.ArrayComparator;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayComparatorTest {

    @Test
    void testArraysAreIdentical() {
        int[] array1 = ArrayComparator.getArray();
        int[] array2 = new int[]{1, 2, 3, 4};

        assertThat(array1).containsExactly(array2);
    }
}
