package pl.devsmentoring.java.Module8.Exercise2;

public class Square extends Shape {
    private int length;

    public Square (int length){
        this.length = length;
        System.out.println("Length of your square is: " + length);
    }

    @Override
    protected void countingArea() {
        System.out.println("I am calculating the area now.");
        super.a = this.length;
        super.b = this.length;
        super.countingArea();
    }
}
