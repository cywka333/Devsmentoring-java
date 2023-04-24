package pl.devsmentoring.java.TestOOP;

class Cylinder extends Tank{
    private double radius;
    private double height;

    public Cylinder(String name, double radius, double height) {
        super(name, Math.PI * Math.pow(radius, 2) * height);
        this.radius = radius;
        this.height = height;
    }
}


