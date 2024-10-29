// Ejercicio 4: Verificaciones en ArrayList de objetos múltiples
package s1t4level2.src.exercise4;
import java.util.ArrayList;
import java.util.List;

public class ObjectContainer {
    private final List<Object> container = new ArrayList<>();

    public void addObject(Object obj) {
        container.add(obj);
    }

    public List<Object> getContainer() {
        return container;
    }
}
