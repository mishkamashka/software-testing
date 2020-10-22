package main;

import static main.Trigonometry.*;
import static main.Logarithms.*;

public class FuncSystem {

    public static double system(double x) {
        if (x <= 0)
            return firstFunction(x);
        else
            return secondFunction(x);
    }

    private static double firstFunction(double x) {
        return (((((tan(x) + cot(x)) * tan(x)) + (tan(x) + cos(x))) - ((csc(x) + cot(x)) * ((cot(x) + csc(x)) + csc(x)))) -
                - ((((csc(x) + tan(x)) / sec(x)) / (tan(x) - (cos(x) - sin(x)))) * sin(x)));

    }

    private static double secondFunction(double x) {
        return (Math.pow(((Math.pow(ln(x),3) - ln(x)) * log_10(x)) * (log_10(x) / log_3(x)),2));
    }
}