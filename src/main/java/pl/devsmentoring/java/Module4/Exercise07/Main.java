package pl.devsmentoring.java.Module4.Exercise07;

public class Main {
    public static void main(String[] args) {

        DivisibleNumbersService divisibleNumbersService = new DivisibleNumbersService();
        divisibleNumbersService.printLoopFrom50To100(System.in, System.out);

        divisibleNumbersService.printLoopUserRangeChoice(System.in, System.out);
    }
}
