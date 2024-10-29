// Ejercicio 4: Test de verificaciones en ArrayList de objetos múltiples
package s1t4level2.test.exercise4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import s1t4level2.src.exercise4.ObjectContainer;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;

public class ObjectContainerTest {

    private ObjectContainer objectContainer;
    private String str;
    private Integer integer;
    private Double dbl;
    private Boolean bool;

    @BeforeEach
    void setUp() {
        objectContainer = new ObjectContainer();
        str = "String";
        integer = 10;
        dbl = 15.5;
        bool = true;

        objectContainer.addObject(str);
        objectContainer.addObject(integer);
        objectContainer.addObject(dbl);
        objectContainer.addObject(bool);
    }

    @Test
    void testObjectsInsertedInOrder() {
        assertThat(objectContainer.getContainer()).containsExactly(str, integer, dbl, bool);
    }

    @Test
    void testObjectsContainAnyOrder() {
        assertThat(objectContainer.getContainer()).containsExactlyInAnyOrder(str, integer, dbl, bool);
    }

    @Test
    void testObjectAddedOnlyOnce() {
        assertThat(objectContainer.getContainer()).containsOnlyOnce(integer);
    }

    @Test
    void testListDoesNotContainUnaddedObject() {
        assertThat(objectContainer.getContainer()).doesNotContain("UnaddedObject");
    }
}
