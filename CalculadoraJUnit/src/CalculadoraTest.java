
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    private static Calculadora calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3), "La suma debe ser 5");
        assertNotEquals(6, calculadora.sumar(2, 3), "El resultado no debe ser 6");
    }

    @Test
    void testRestar() {
        assertEquals(1, calculadora.restar(3, 2), "La resta debe ser 1");
        assertNotEquals(0, calculadora.restar(3, 2), "El resultado no debe ser 0");
    }

    @Test
    void testMultiplicar() {
        assertTrue(calculadora.multiplicar(2, 3) == 6, "La multiplicación debe ser 6");
        assertFalse(calculadora.multiplicar(2, 3) == 5, "El resultado no debe ser 5");
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3), "La división debe ser 2.0");
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(6, 0), "Debe lanzar una excepción por dividir entre cero");
    }

    @RepeatedTest(3)
    void testMultiplicarRepetida() {
        assertEquals(15, calculadora.multiplicar(3, 5), "La multiplicación debe ser 15 en prueba repetida");
    }
}
