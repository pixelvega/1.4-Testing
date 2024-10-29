package s1t4level2.test;//Exercise 2

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import s1t4level2.src.ReferenceEquality;

import static org.junit.jupiter.api.Assertions.*;

public class ReferenceEqualityTest {

    private final ReferenceEquality referenceEqualityTest = new ReferenceEquality();

    @Test
    @DisplayName("test ReferenceEquality")
    public void areSameReference() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Object obj3 = new Object();

        assertTrue(referenceEqualityTest.areSameReference(obj1, obj2), "Las referencias deben ser iguales");
        assertFalse(referenceEqualityTest.areSameReference(obj1, obj3), "Las referencias deben ser distintas");
    }
}
