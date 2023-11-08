package calculoFinancieroSinMockito;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculoFinancieroTest {

    @Test
    public void testEjecutaConValoresPositivos() {
        // Preparar
        CalculoFinanciero cf = new CalculoFinanciero();
        long l = 12345L;
        float f = 123.45f;
        int i = 123;
        byte b = 12;

        // Ejecutar
        double resultado = cf.ejecuta(l, f, i, b);
        
        // Verificar
        assertFalse(Double.isNaN(resultado), "El resultado no debe ser NaN");
        assertTrue(resultado >= 0, "El resultado debe ser positivo o cero");
        // Aquí pondrías un valor esperado concreto si lo tuvieras:
        // assertEquals(valorEsperado, resultado, "El resultado debe coincidir con el valor esperado");
    }

    @Test
    public void testEjecutaConValoresQuePodrianGenerarNaN() {
        // Preparar
        CalculoFinanciero cf = new CalculoFinanciero();
        long l = -12345L; // Puede causar un NaN debido a Math.pow con base negativa y exponente no entero
        float f = -0.0001f; // Puede causar una división por cero
        int i = -1; // Puede causar un resultado negativo en Math.log1p
        byte b = 0; // Math.pow con exponente 0 devuelve 1, evitando NaN en este caso

        // Ejecutar
        double resultado = cf.ejecuta(l, f, i, b);
        
        // Verificar
        assertFalse(Double.isNaN(resultado), "El resultado no debe ser NaN");
        assertTrue(resultado >= 0, "El resultado debe ser positivo o cero");
    }

    // Puedes agregar más métodos de prueba para cubrir casos de borde y escenarios adicionales.
}
