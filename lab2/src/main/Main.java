package main;

public class Main {
    public static void main(String[] args) {
        System.out.printf("expected: %f; got: %f\n", Math.sin(0.5), Trigonometry.sin(0.5));
        System.out.printf("system: %f", FuncSystem.system(0.5));
    }
}
