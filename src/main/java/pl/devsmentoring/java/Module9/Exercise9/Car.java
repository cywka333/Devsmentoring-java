package pl.devsmentoring.java.Module9.Exercise9;

public class Car extends Vehicle{
    int doorNo;

    public Car(int doorNo) {
        this.doorNo = doorNo;
    }

    @Override
    void checkFuel() {
        System.out.println("Fuel level ok.");
    }

    @Override
    int oilStatusGenerator() {
        return super.oilStatusGenerator();
    }

    @Override
    void checkOil() {
        super.checkOil();
    }

    @Override
    protected void engineStart() {
        super.engineStart();
    }

    public void turnOffStartStop(){
        System.out.println("Don't forget to turn off system start-stop.");
    }

    public int doorNumberResult (){
        switch (this.doorNo){
            case 3:
                System.out.println("I am coupe.");
                break;
            case 4:
                System.out.println("I am limousine");
                break;
            case 5:
                System.out.println("I am family car.");
                break;
            default:
                System.out.println("I am something different.");
        }
        return this.doorNo;
    }
}
