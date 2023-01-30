package pl.devsmentoring.java.Module8.Exercise2;

public class Shape {
    protected int length;

    public Shape(int length) {
        this.length = length;
    }

    protected int calculateArea() {
        return 0;
    }

    protected void areaDisplay(){
        System.out.println("Area: " + calculateArea());
    }
}