package pl.devsmentoring.java.TestOOP;

public class Cuboid extends Tank implements Operations {



    public Cuboid(String name, int length, int width, int height) {
        super(name, length, width, height);
    }

    @Override
    public double calculateVolume() {
        this.maxValue = length*width*height;
        return maxValue;
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
