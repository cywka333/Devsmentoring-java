package pl.devsmentoring.java.Module8.Exercise8;

public class MessagingSystem {

    private static int warningCounter = 0;
    private static int infoCounter = 0;

    public static void showWarning() {
        System.out.println("Watch out! Warning here!");
        System.out.println("Warning message has been executed " + ++warningCounter + " times");
    }

    public static void showInfo() {
        System.out.println("Listen carefully. We have some information regarding …");
        System.out.println("Info message has been executed " + ++infoCounter + " times.");
    }
}
