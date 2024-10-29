// Ejercicio 6: Test de ArrayIndexOutOfBoundsException
package s1t4level2.test.exercise6;

import org.junit.jupiter.api.Test;
import s1t4level2.src.exercise6.ArrayExceptionThrower;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ArrayExceptionThrowerTest {

    @Test
    void testArrayIndexOutOfBoundsExceptionIsThrown() {
        ArrayExceptionThrower thrower = new ArrayExceptionThrower();
        int[] array = {1, 2, 3};

        assertThatThrownBy(() -> thrower.getElement(array, 5))
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
