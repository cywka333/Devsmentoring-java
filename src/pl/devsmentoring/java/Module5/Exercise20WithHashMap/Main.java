package pl.devsmentoring.java.Module5.Exercise20WithHashMap;

public class Main {
    public static void main(String[] args) {
        ColorList cl = new ColorList();
        cl.transformToMap();
        cl.displayCounts();
        cl.displayColors();
        cl.addColor("purpurowy");
        System.out.println("After adding a new color 'purpurowy':\n");
        cl.displayColors();
        cl.removeColor("fioletowy");
        System.out.println("After removing a color 'fioletowy':\n");
        cl.displayColors();
    }
}