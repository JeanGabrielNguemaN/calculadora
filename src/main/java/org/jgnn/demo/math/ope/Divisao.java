package org.jgnn.demo.math.ope;

public class Divisao implements Dividir {
    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a / b;
    }
}
