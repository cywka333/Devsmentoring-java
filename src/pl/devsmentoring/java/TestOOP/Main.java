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

//        Cuboid cuboid = new Cuboid("Szescian 1", 6, 6, 6);
//        cuboid.displayVolume();
//        cuboid.waterLimit();
//
//        Cylinder cylinder = new Cylinder("Walec 1", 8, 9);
//        cylinder.displayVolume();


    }
}
