package pl.devsmentoring.java.TestOOP;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere("Kula 1", 5);
        sphere.displayVolume();

        Cuboid cuboid = new Cuboid("Szescian 1", 6, 6, 6);
        cuboid.displayVolume();

        Cylinder cylinder = new Cylinder("Walec 1", 8, 9);
        cylinder.displayVolume();


    }
}