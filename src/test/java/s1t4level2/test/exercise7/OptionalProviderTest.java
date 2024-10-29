// Ejercicio 7: Test de verificación de Optional vacío
package s1t4level2.test.exercise7;

import org.junit.jupiter.api.Test;
import s1t4level2.src.exercise7.OptionalProvider;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalProviderTest {

    @Test
    void testOptionalIsEmpty() {
        assertThat(OptionalProvider.getEmptyOptional()).isEmpty();
    }
}
