package main;

public class FuncSystem {

    private final BasicTrigonometry basicTrigonometry;
    private final Trigonometry trigonometry;
    private final BasicLogarithm basicLogarithm;
    private final Logarithms logarithms;

    public FuncSystem(BasicLogarithm basicLogarithm, BasicTrigonometry basicTrigonometry, Logarithms logarithms, Trigonometry trigonometry){
        this.basicLogarithm = basicLogarithm;
        this.basicTrigonometry = basicTrigonometry;
        this.logarithms = logarithms;
        this.trigonometry = trigonometry;
    }

    public double system(double x) {
        if (x <= 0)
            return firstFunction(x);
        else
            return secondFunction(x);
    }

    private double firstFunction(double x) {
        return (((((trigonometry.tan(x) + trigonometry.cot(x)) * trigonometry.tan(x)) + (trigonometry.tan(x) + trigonometry.cos(x))) -
                 - ((trigonometry.csc(x) + trigonometry.cot(x)) * ((trigonometry.cot(x) + trigonometry.csc(x)) + trigonometry.csc(x)))) -
                - ((((trigonometry.csc(x) + trigonometry.tan(x)) / trigonometry.sec(x)) / (trigonometry.tan(x) -
                        - (trigonometry.cos(x) - basicTrigonometry.sin(x)))) * basicTrigonometry.sin(x)));

    }

    private double secondFunction(double x) {
        return (Math.pow(((Math.pow(basicLogarithm.ln(x),3) - basicLogarithm.ln(x)) * logarithms.log10(x)) * (logarithms.log10(x) / logarithms.log3(x)),2));
    }
}