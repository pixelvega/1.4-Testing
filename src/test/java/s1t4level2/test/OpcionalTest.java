package s1t4level2.test;// Exercise 7

import org.junit.jupiter.api.Test;
import s1t4level2.src.Opcional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpcionalTest {

    private final Opcional optionalTest = new Opcional();

    @Test
    public void testOptionalIsEmpty() {
        Optional<String> emptyOptional = optionalTest.createEmptyOptional();

        assertTrue(emptyOptional.isEmpty(), "El Optional debe estar vacío");
    }
}
