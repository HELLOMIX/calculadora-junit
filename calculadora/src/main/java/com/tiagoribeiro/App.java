package com.tiagoribeiro;

class App 
{
    public static void main( String[] args )
    {
        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(2, 3));
        System.out.println(calc.subtracao(5, 2));
        System.out.println(calc.multiplicacao(4, 2));
        System.out.println(calc.divisao(8, 2));
        System.out.println(calc.potencia(2, 3));
    }
}
