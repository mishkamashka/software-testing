package main.task1;

public class ArcsinCalculator {

    private final static double delta = 1e-10;

    public static double arcsin(double x) throws IllegalArgumentException{
        if (Math.abs(x) > 1)
            throw new IllegalArgumentException("X should be in [-1;1]");
        double arcsin = 0;
        double summand = x;
        int i = 0;
        x *= x;
        do {
            arcsin += summand;
            summand = summand * x * (i + 0.5) / (i + 1) * (i + 0.5) / (i + 1.5);
            i++;
        } while (Math.abs(summand) >= delta);
        return arcsin;
    }
}