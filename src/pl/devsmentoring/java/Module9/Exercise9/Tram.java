package pl.devsmentoring.java.Module9.Exercise9;

public class Tram extends Vehicle{

    public Tram(int tramNo) {
        this.tramNo = tramNo;
    }

    int tramNo;

    @Override
    void checkFuel() {
        System.out.println("I am using electricity. System is on.");
    }

    @Override
    void checkOil() {
        super.checkOil();
    }

    @Override
    int oilStatusGenerator() {
        return super.oilStatusGenerator();
    }

    @Override
    protected void engineStart() {
        super.engineStart();
    }

    public void turnOnTicketMachine(){
        System.out.println("Ticket machine is on.");
    }

    public void tramNumberDisplay(){
        System.out.println("I am tram number: " + this.tramNo);
    }

}
