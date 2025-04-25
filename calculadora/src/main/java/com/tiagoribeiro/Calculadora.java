package com.tiagoribeiro;
import java.lang.Math;

public class Calculadora {
    public double soma(double a, double b) {
        return a + b;
    }
    public double subtracao(double a, double b) {
        return a - b;
    }
    public double multiplicacao(double a, double b) {
        return a * b;
    }
    public double divisao(double a, double b) {
        return a / b;
    }
    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }
}
