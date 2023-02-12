package pl.devsmentoring.java.Module9.Exercise9;

public class Motorcycle extends Vehicle{

    public Motorcycle(String insertBrand) {
        this.insertBrand = insertBrand;
    }

    String insertBrand;
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

    public String motorcycleBrand(){
        System.out.println("My brand is: " + this.insertBrand);
        return this.insertBrand;
    }
}
