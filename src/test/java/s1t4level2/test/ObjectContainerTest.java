package s1t4level2.test;//Exercise 4

import org.junit.jupiter.api.Test;
import s1t4level2.src.ObjectContainer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectContainerTest {

    private final ObjectContainer objectContainerTest = new ObjectContainer();

    @Test
    public void testObjectContainerOrder() {
        List<Object> container = objectContainerTest.createContainer();

        assertEquals("String Element", container.get(0), "El primer elemento debe ser el String");
        assertEquals(42, container.get(1), "El segundo elemento debe ser el entero");
        assertEquals(3.14, container.get(2), "El tercer elemento debe ser el double");

        assertTrue(container.contains(42), "El contenedor debe contener el número 42");
        assertTrue(container.contains("String Element"), "El contenedor debe contener el String 'String Element'");
        assertTrue(container.contains(3.14), "El contenedor debe contener el double 3.14");

        assertEquals(1, container.stream().filter(o -> o.equals(42)).count(), "El objeto 42 debe estar una sola vez");

        assertFalse(container.contains("Elemento Inexistente"), "El contenedor no debe contener 'Elemento Inexistente'");
    }
}
