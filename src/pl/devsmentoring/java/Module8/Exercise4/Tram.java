package pl.devsmentoring.java.Module8.Exercise4;

public class Tram extends Vehicle {
    private int wagonNo;

    public int getWagonNo() {
        return wagonNo;
    }

    public void setWagonNo(int wagonNo) {
        this.wagonNo = wagonNo;
    }

    private final String vehicleType = "Tram";


    public Tram(int velocityMax, int vehicleNumber, int wagonNo) {
        super(velocityMax, vehicleNumber);
        if (wagonNo >= 1 && wagonNo <= 3){
            this.wagonNo = wagonNo;
        }else {
            System.out.println("Please enter number of wagons between 1-3!");
        }
    }

    @Override
    void introduce() {
        if (this.wagonNo >= 1 && wagonNo <= 3) {
            System.out.println("Hello, I am: " + this.vehicleType);
            super.introduce();
            System.out.println("I have got " + this.wagonNo + " wagons\n");
        }else {
            System.out.println("You entered wrong numbers of wagons!");
        }
    }
}
