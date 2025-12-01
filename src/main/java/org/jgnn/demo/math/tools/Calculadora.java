package org.jgnn.demo.math.tools;

import org.jgnn.demo.math.ope.*;

public class Calculadora {

    private Somar somador;
    private Substrair subtrator;
    private Multiplicar multiplicador;
    private Dividir divisor;

    
    public Calculadora() {
        this.somador = new Soma();
        this.subtrator = new Substracao();
        this.multiplicador = new Multiplicacao();
        this.divisor = new Divisao();
    }

    public double somar(double a, double b) {
        return somador.somar(a, b);
    }

    public double subtrair(double a, double b) {
        return subtrator.subtrair(a, b);
    }

    public double multiplicar(double a, double b) {
        return multiplicador.multiplicar(a, b);
    }

    public double dividir(double a, double b) {
        return divisor.dividir(a, b);
    }
}
