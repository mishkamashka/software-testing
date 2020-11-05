package main;

import java.util.IllformedLocaleException;

public class Trigonometry {

    private final BasicTrigonometry basicTrigonometry;

    public Trigonometry(BasicTrigonometry basicTrigonometry) {
        this.basicTrigonometry = basicTrigonometry;
    }

    public double cos(double x){
//        return Math.sqrt(1 - Math.pow(basicTrigonometry.sin(x), 2));
        return basicTrigonometry.sin(x + Math.PI / 2);
    }

    public double sec(double x){
        double cos = cos(x);
        if (cos == 0)
            throw new IllegalArgumentException();
        return 1 / cos;
    }

    public double csc(double x){
        double sin = basicTrigonometry.sin(x);
        if (sin == 0)
            throw new IllegalArgumentException();
        return 1 / sin;
    }

    public double tan(double x){
        double cos = cos(x);
        if (cos == 0)
            throw new IllegalArgumentException();
        return basicTrigonometry.sin(x) / cos;
    }

    public double cot(double x){
        double sin = basicTrigonometry.sin(x);
        if (sin == 0)
            throw new IllegalArgumentException();
        return cos(x) / sin;
    }
}
