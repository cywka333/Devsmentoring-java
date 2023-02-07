package pl.devsmentoring.java.TestOOP;

class Sphere extends Tank {
    private double radius;

    public Sphere(String name, double radius) {
        super(name, (4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
        this.radius = radius;
    }

}

