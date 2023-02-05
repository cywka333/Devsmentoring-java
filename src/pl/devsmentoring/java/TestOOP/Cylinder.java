package pl.devsmentoring.java.TestOOP;

public class Cylinder extends Tank {

    double pi = 3.14;

    public Cylinder(String name, int height, int r) {
        super(name, height, r);
    }

    @Override
    public double calculateVolume() {
        this.maxValue = pi * (r * r) * height;
        return maxValue;
    }
}


