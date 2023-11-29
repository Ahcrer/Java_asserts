package app;

public class Calculadora {

    public int add(int a, int b) {
        return a + b;
    }

    public int substact(int a, int b) {
        return a - b;
    }

    public int multipy(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No puedes dividir entre 0");
        }
        return (double) a / b;
    }

}
