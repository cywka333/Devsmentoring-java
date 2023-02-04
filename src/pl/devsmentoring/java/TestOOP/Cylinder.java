package pl.devsmentoring.java.TestOOP;

public class Cylinder extends Tank implements Operations{

    double pi = 3.14;

    public Cylinder(String name, int height, int r) {
        super(name, height, r);
    }

    @Override
    public double calculateVolume() {
        this.maxValue = pi*(r*r)*height;
        return maxValue;
    }

    @Override
    protected void displayVolume() {
        super.displayVolume();
    }

    @Override
    public double pourWater(double waterAdd) {
        return 0;
    }

    @Override
    public double pourOutWater(double waterOut) {
        return 0;
    }

    @Override
    public int transferWater() {
        return 0;
    }
}
