// Ejercicio 5: Test de verificación de llaves en un mapa
package s1t4level2.test.exercise5;
import org.junit.jupiter.api.Test;
import s1t4level2.src.exercise5.MapaContainer;

import static org.assertj.core.api.Assertions.assertThat;

public class MapaContainerTest {

    @Test
    void testMapContainsKey() {
        MapaContainer mapContainer = new MapaContainer();
        mapContainer.addEntry("key1", 100);

        assertThat(mapContainer.getMap()).containsKey("key1");
    }
}
