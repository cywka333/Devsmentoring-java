package pl.devsmentoring.java.Module8.Exercise2;

public class Square extends Shape {

    public Square(int length) {
        super(length);
    }

    @Override
    protected int calculateArea() {
        return length*length;
    }

    @Override
    protected void areaDisplay() {
        if (length >= 0) {
            super.areaDisplay();
        }else {
            System.out.println("You probably typed negative number.");
        }
    }
}
