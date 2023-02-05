package pl.devsmentoring.java.TestOOP;

public class Sphere extends Tank {

    double pi = 3.14;

    public Sphere(String name, int r) {
        super(name, r);
    }

    @Override
    public double calculateVolume() {
        this.maxValue = (4.0/3.0)*pi*(r*r*r);
        return maxValue;
    }

}
