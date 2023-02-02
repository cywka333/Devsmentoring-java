package pl.devsmentoring.java.TestOOP;

public class Cuboid extends Tank implements Operations {


    public Cuboid(String name, int length, int width, int height) {
        super(name, length, width, height);
    }

    @Override
    public double calculateVolume() {
        return length*width*height;
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
