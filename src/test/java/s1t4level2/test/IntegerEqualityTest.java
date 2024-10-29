package s1t4level2.test;//Exercise 1

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import s1t4level2.src.IntegerEquality;

import static org.assertj.core.api.Assertions.assertThat;


public class IntegerEqualityTest {

    private final IntegerEquality integerEqualityTest = new IntegerEquality();

    @Test
    @DisplayName("test IntegerEquality")
    public void areEqual() {
        Integer a = 10;
        Integer b = 10;
        Integer c = 20;

        assertThat(a.equals(b));
        assertThat(!a.equals(c));    }
}
