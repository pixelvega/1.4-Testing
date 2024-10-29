package s1t4level2.test;//Exercise 5

import org.junit.jupiter.api.Test;
import s1t4level2.src.Mapa;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapaTest {
    private final Mapa mapTest = new Mapa();

    @Test
    public void testMapContainsKey() {
        Map<String, Integer> map = mapTest.createMap();

        assertTrue(map.containsKey("key1"), "El mapa debe contener la clave 'key1'");
    }
}
