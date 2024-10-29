package s1t4level2.test;//Exercise 3

import org.junit.jupiter.api.Test;
import s1t4level2.src.ArrayEquality;


import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayEqualityTest {
    private final ArrayEquality arrayEqualityTest = new ArrayEquality();

    @Test
    public void areArraysEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4, 5, 6};

        assertThat(array1.equals(array2));
        assertFalse(arrayEqualityTest.areArraysEqual(array1, array3), "Los arrays no deben ser iguales");
    }
}
