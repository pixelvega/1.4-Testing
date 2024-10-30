// Ejercicio 6: Provocar una excepción ArrayIndexOutOfBoundsException
package s1t4level2.src.exercise6;

public class ArrayExceptionThrower {

    public int getElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango: " + index);
        }

        return array[index];
    }
}
