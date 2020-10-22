package main;

public class Trigonometry {
    private final static double delta = 1e-5;

    private static double fact(int x) {
        double factorial = 1;
        for (int i = 2; i <= x; i++)
            factorial *= i;
        return factorial;
    }

    public static double sin(double x){
        if (Math.abs(x) > 1)
            throw new IllegalArgumentException();

        double summand, sin = 0;
        int i = 0;
        do {
            summand = (Math.pow(-1, i) * Math.pow(x, (2 * i + 1))) / fact(2 * i + 1);
            sin += summand;
            i++;
        } while(Math.abs(summand) > delta);
        return sin;
    }

    public static double cos(double x){
        return sin(x + Math.PI / 2);
    }

    public static double sec(double x){
        return 1 / cos(x);
    }

    public static double csc(double x){
        return 1 / sin(x);
    }

    public static double tan(double x){
        return sin(x) / cos(x);
    }

    public static double cot(double x){
        return cos(x) / sin(x);
    }
}
