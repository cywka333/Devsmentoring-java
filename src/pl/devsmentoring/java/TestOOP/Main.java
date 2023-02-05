package pl.devsmentoring.java.TestOOP;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere("Kula 1", 5);
        sphere.displayVolume();
        sphere.waterLimit();
        sphere.pourWater(22.33);
        System.out.println("-----------");
        sphere.pourWater(400.1);
        System.out.println("-----------");
        sphere.pourWater(-400.1);
        System.out.println("-----NEGATIVE-----------");
        sphere.pourWater(102);
        System.out.println("-----------MAX VALUE---------------");
        System.out.println(sphere.maxValue);
        System.out.println("---------------ZABIERAMY----------------------");
        sphere.pourOutWater(100.0);
        sphere.pourOutWater(-20.0);
        sphere.pourOutWater(202.0);
        sphere.pourOutWater(100);




    }
}
