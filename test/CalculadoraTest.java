import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        double resultado = Calculadora.sumar(2, 3);
        assertEquals(5, resultado, 0);

    }

    @Test
    void restar() {
        double resultado = Calculadora.restar(5, 3);
        assertEquals(2, resultado, 0);
    }

    @Test
    void multiplicar() {
        double resultado = Calculadora.multiplicar(4, 3);
        assertEquals(12, resultado, 0);
    }

    @Test
    void dividir() {

        double resultado = Calculadora.dividir(10, 2);
        assertEquals(5, resultado, 0);
    }
}