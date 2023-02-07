package pl.devsmentoring.java.TestOOP;

class Cuboid extends Tank {
    private double length;
    private double width;
    private double height;

    public Cuboid(String name, double length, double width, double height) {
        super(name, length * width * height);
        this.length = length;
        this.width = width;
        this.height = height;
    }

}

