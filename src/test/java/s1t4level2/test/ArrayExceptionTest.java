package s1t4level2.test;// Exercise 6

import org.junit.jupiter.api.Test;
import s1t4level2.src.ArrayException;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayExceptionTest {

    private final ArrayException arrayExceptionTest = new ArrayException();

    @Test
    public void testArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class,
                arrayExceptionTest::throwArrayIndexOutOfBounds,
                "Se debe lanzar ArrayIndexOutOfBoundsException");
    }
}
