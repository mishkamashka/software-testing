package main;

public class Main {
    public static void main(String[] args) {
        BasicLogarithm basicLogarithm = new BasicLogarithm();
        BasicTrigonometry basicTrigonometry = new BasicTrigonometry();
        FuncSystem system = new FuncSystem(basicLogarithm, basicTrigonometry, new Logarithms(basicLogarithm), new Trigonometry(basicTrigonometry));
        System.out.printf("system: %f\n", system.system(0.970));
        ResultPrinter.print(system::system, 0.1, -5, 5, "result.csv");
    }
}
