package s1t4level3.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import s1t4level3.src.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void sumar() {
        assertEquals(5, calculadora.sumar(2, 3), "La suma de 2 + 3 debe ser 5");
    }

    @Test
    public void restar() {
        assertEquals(2, calculadora.restar(5, 3), "La resta de 5 - 3 debe ser 2");
    }

    @Test
    public void multiplicar() {
        assertEquals(15, calculadora.multiplicar(3, 5), "La multiplicación de 3 * 5 debe ser 15");
    }

    @Test
    public void dividir() {
        assertEquals(2, calculadora.dividir(10, 5), "La división de 10 / 5 debe ser 2");
    }

}
