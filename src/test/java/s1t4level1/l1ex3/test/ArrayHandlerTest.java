package s1t4level1.l1ex3.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import s1t4level1.l1ex3.src.ArrayHandler;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayHandlerTest {

    @Test
    @DisplayName("test ArrayIndexOutOfBounds Exception")
    void getElementAtIndex() {
        ArrayHandler arrayHandler = new ArrayHandler();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAtIndex(10);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAtIndex(-1);
        });
    }
}
