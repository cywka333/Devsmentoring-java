package pl.devsmentoring.java.Module9.Exercise4;

class CalculationSystem {
    private Calculator calculator;

    public CalculationSystem(Calculator calculator) {
        this.calculator = calculator;
    }

    public void performCalculations(int a, int b) {
        System.out.println("Substract: " + calculator.substract(a, b));
        System.out.println("Add: " + calculator.add(a, b));
        System.out.println("Multiply: " + calculator.multiply(a, b));
        if (b == 0){
            System.out.println("You can not divide by 0!");
        }else{
            System.out.println("Divide: " + calculator.divide(a, b));
        }

    }

}





