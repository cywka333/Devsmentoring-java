package pl.devsmentoring.java.Streams.Exercise10;

abstract class Animal {
    private String name;
    private int noEyes;

    public Animal(String name, int noEyes) {
        this.name = name;
        this.noEyes = noEyes;
    }

    public int getNoEyes() {
        return noEyes;
    }

    public String getName() {
        return name;
    }
}