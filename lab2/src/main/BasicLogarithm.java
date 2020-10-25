package main;

public class BasicLogarithm {
    public double ln(double x) {
        if (x <= 0)
            throw new IllegalArgumentException();
        double first = (x - 1) / (x + 1);
        double current = first;
        double ln = 0;
        int n = 3;

        while (Math.abs(2 * current) > 1E-8) {
            ln += 2 * current;
            current *= Math.pow(first, 2) / n * (n - 2);
            n += 2;
        }

        return ln;
    }
}
