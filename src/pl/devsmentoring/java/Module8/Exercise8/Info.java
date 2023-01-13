package pl.devsmentoring.java.Module8.Exercise8;

public class Info {
    private static final String infoMessage = "Listen carefully. We have some information regarding …";
    private static int counterInfo = 0;

    public static void execute(){
        System.out.println(infoMessage);
        counterInfo++;
        System.out.println("Method execute in class Info was used: " + counterInfo + " times\n");
    }

    public static void showInfo(){
        execute();
    }
}
