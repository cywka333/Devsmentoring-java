package pl.devsmentoring.java.Module9.Exercise2;

public class Bus extends Vehicle {
        private int fuelMonthlyUsage;
        private final String vehicleType = "Bus";

        public Bus(int velocityMax, int vehicleNumber, int fuelMonthlyUsage) {
            super(velocityMax, vehicleNumber);
            this.fuelMonthlyUsage = fuelMonthlyUsage;
        }

        public int getFuelMonthlyUsage() {
            return fuelMonthlyUsage;
        }

      @Override
      public void introduce() {
            System.out.println("Hello, I am " + this.vehicleType);
        super.introduce();
          System.out.println("My monthly usage of fuel is: " + this.fuelMonthlyUsage + "\n");
    }
}

