package pl.devsmentoring.java.Module6.Exercise05;

public class Vehicle {
    float velocityMax = 0;
    float mileage = 0;

    float mileageAdder (float... values){
        for (float value : values){
            mileage+=value;
        }
        return mileage;
    }

    void displayVehicleInformation(){
        System.out.println("Mileage is: " + mileageAdder());
        System.out.println("Velocity max is: " + velocityMax);
    }

    float getVelocityMax() { return velocityMax;
    }

    float getMileage(){
        return mileage;
    }

    void setVelocityMax(float velocityMax){
        this.velocityMax = velocityMax;
    }

    void setMileage(float mileage){
        this.mileage = mileage;
    }
}
