package pl.devsmentoring.java.Module9.Exercise4;

public class Main {

    public static void main(String[] args) {
        CalculationSystem calculationSystem = new CalculationSystem(new Calculator() {
            @Override
            public int substract(int a, int b) {
                return a-b;
            }

            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int multiply(int a, int b) {
                return a*b;
            }

            @Override
            public double divide(int a, int b) {
                return a/b;
            }
        });
        calculationSystem.performCalculations(10, 5);
        System.out.println("");
        calculationSystem.performCalculations(7, 0);
        System.out.println("");
        calculationSystem.performCalculations(-1, 3);
    }
}
