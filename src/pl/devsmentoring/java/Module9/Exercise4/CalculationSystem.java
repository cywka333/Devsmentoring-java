package pl.devsmentoring.java.Module9.Exercise4;

class CalculationSystem {
    private Calculator calculator;

    public CalculationSystem (Calculator calculator){
        this.calculator = calculator;
    }

    public void performCalculations(int a, int b){
        System.out.println("Substract: " + calculator.substract(a, b));
        System.out.println("Add: " + calculator.add(a, b));
        System.out.println("Multiply: " + calculator.multiply(a, b));
        System.out.println("Divide: " + calculator.divide(a, b));
    }

    Calculator calculatorImplementation = new Calculator() {
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
    };

}



