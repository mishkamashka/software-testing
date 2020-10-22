package main;

public class Logarithms {
    public static double ln(double x) {
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

    public static double log_3(double x) {
        return ln(x) / ln(3);
    }

    public static double log_10(double x) {
        return ln(x) / ln(10);
    }
}
