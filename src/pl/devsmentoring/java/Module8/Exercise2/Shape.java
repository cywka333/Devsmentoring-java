package pl.devsmentoring.java.Module8.Exercise2;

public class Shape {
    protected int length;
    protected int height;

    public Shape(){
        this.length = 0;
        this.height = 0;
    }

    public Shape(int length, int height) {
        this.length = length;
        this.height = height;
    }

    protected int calculateArea() {
        return length*height;
    }

    protected void areaDisplay(){
        System.out.println("Area: " + calculateArea());
    }
}