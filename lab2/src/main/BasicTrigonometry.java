package main;

public class BasicTrigonometry {

    private final static double delta = 1e-5;

    private static double fact(int x) {
        double factorial = 1;
        for (int i = 2; i <= x; i++)
            factorial *= i;
        return factorial;
    }

    public double sin(double x){
        double summand, sin = 0;
        int i = 0;
        do {
            summand = (Math.pow(-1, i) * Math.pow(x, (2 * i + 1))) / fact(2 * i + 1);
            sin += summand;
            i++;
        } while(Math.abs(summand) > delta);
        return sin;
    }
}
