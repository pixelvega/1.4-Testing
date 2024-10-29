// Ejercicio 2: Test de referencia de objetos

package s1t4level2.test.exercise2;
import org.junit.jupiter.api.Test;
import s1t4level2.src.exercise2.ReferenceHolder;

import static org.assertj.core.api.Assertions.assertThat;

public class ReferenceHolderTest {

    @Test
    void testReferencesAreSame() {
        ReferenceHolder holder = new ReferenceHolder("Object1");

        assertThat(holder).isSameAs(holder);
    }

    @Test
    void testReferencesAreNotSame() {
        ReferenceHolder holder1 = new ReferenceHolder("Object1");
        ReferenceHolder holder2 = new ReferenceHolder("Object1");

        assertThat(holder1).isNotSameAs(holder2);
    }
}
