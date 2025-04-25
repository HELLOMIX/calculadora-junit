package com.tiagoribeiro;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTeste {
    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        double resultado = calc.soma(2, 3);
        assertEquals(5, resultado, 0.001);
    }

    @Test
    public void testSubtracao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.subtracao(5, 2);
        assertEquals(3, resultado, 0.001);
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicacao(4, 2);
        assertEquals(8, resultado, 0.001);
    }

    @Test
    public void testDivisao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.divisao(8, 2);
        assertEquals(4, resultado, 0.001);
    }

    @Test
    public void testPotencia() {
        Calculadora calc = new Calculadora();
        double resultado = calc.potencia(2, 3);
        assertEquals(8, resultado, 0.001);
    }
}
