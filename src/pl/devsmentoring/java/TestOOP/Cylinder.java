package pl.devsmentoring.java.TestOOP;

public class Cylinder extends Tank implements Operations{

    double pi = 3.14;

    public Cylinder(String name, int height, int r) {
        super(name, height, r);
    }

    @Override
    public double calculateVolume() {
        return pi*(r*r)*height;
    }

    @Override
    protected void displayVolume() {
        super.displayVolume();
    }

    @Override
    public int pourWater() {
        return 0;
    }

    @Override
    public int pourOutWater() {
        return 0;
    }

    @Override
    public int transferWater() {
        return 0;
    }
}
