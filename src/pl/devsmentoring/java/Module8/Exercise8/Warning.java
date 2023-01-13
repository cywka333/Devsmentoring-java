package pl.devsmentoring.java.Module8.Exercise8;

public class Warning {
    private static int counterWarnings = 0;
    private static final String warningMessage = "Watch out! Warning here!";

    public static void execute (){
        System.out.println(warningMessage);
        counterWarnings++;
        System.out.println("Method execute in class Warning was used: " + counterWarnings + " times\n");
    }

    public static void showWarning(){
        execute();
    }
}
