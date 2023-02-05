package pl.devsmentoring.java.TestOOP;

public class Cuboid extends Tank{


    public Cuboid(String name, int length, int width, int height) {
        super(name, length, width, height);
    }

    @Override
    public double calculateVolume() {
        this.maxValue = length*width*height;
        return maxValue;
    }

}
