package pl.devsmentoring.java.TestOOP;

public class Sphere extends Tank implements Operations {

    double pi = 3.14;

    public Sphere(String name, int r) {
        super(name, r);
    }

    @Override
    public double calculateVolume() {
        return (4.0/3.0)*pi*(r*r*r);
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
