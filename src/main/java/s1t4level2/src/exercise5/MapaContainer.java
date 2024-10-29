// Ejercicio 5: Verificación de llaves en un mapa
package s1t4level2.src.exercise5;
import java.util.HashMap;
import java.util.Map;

public class MapaContainer {
    private final Map<String, Integer> map = new HashMap<>();

    public void addEntry(String key, Integer value) {
        map.put(key, value);
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
