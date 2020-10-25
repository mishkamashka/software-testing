package main;

public class Logarithms {

    private final BasicLogarithm basicLogarithm;

    public Logarithms(BasicLogarithm basicLogarithm) {
        this.basicLogarithm = basicLogarithm;
    }

    public double log3(double x) {
        return basicLogarithm.ln(x) / basicLogarithm.ln(3);
    }

    public double log10(double x) {
        return basicLogarithm.ln(x) / basicLogarithm.ln(10);
    }
}
