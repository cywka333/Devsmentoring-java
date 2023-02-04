package pl.devsmentoring.java.TestOOP;

public class Sphere extends Tank implements Operations {

    double pi = 3.14;

    public Sphere(String name, int r) {
        super(name, r);
    }

    @Override
    public double calculateVolume() {
        this.maxValue = (4.0/3.0)*pi*(r*r*r);
        return maxValue;
    }

    @Override
    public double pourWater(double waterAdd) {
        double reamingFreeVolume = this.maxValue - waterAdd;
        if (this.maxValue == calculateVolume()){
            this.maxValue=reamingFreeVolume;
            this.reamingVolume = reamingFreeVolume;
            System.out.println("Your " + this.name + " was empty. You added: " + waterAdd + " of water. You have: " + reamingFreeVolume + " free volume.");
        }else if (reamingFreeVolume > 0 && waterAdd >= 0){
            this.maxValue=reamingFreeVolume;
            this.reamingVolume = reamingFreeVolume;
            System.out.println("You added: " + waterAdd + " of water.");
            System.out.println("Reaming free value of " + this.name + " is: " + reamingFreeVolume);
        } else if (reamingFreeVolume > 0 && waterAdd < 0){
            reamingFreeVolume+=waterAdd;
            this.maxValue=reamingFreeVolume;
            System.out.println("You can not add negative value. You can pour: " + reamingFreeVolume);
        }
        else {
            reamingFreeVolume-=waterAdd;
            this.maxValue=reamingFreeVolume;
            System.out.println("You can't pour so much water. You pour over :" + reamingFreeVolume);
        }
        return reamingFreeVolume;
    }

    @Override
    public double pourOutWater(double waterOut) {
        double reamingTakenVolume = this.reamingVolume - waterOut;
        if (this.maxValue == calculateVolume()){
            this.maxValue=reamingTakenVolume;
            System.out.println("Your " + this.name + "was empty. You added: " + waterOut + " of water. You have: " + reamingTakenVolume + " free volume.");
        }else if (reamingTakenVolume > 0 && waterOut >= 0){
            this.maxValue=reamingTakenVolume;
            System.out.println("You added: " + waterOut + " of water.");
            System.out.println("Reaming free value of " + this.name + " is: " + reamingTakenVolume);
        } else if (reamingTakenVolume > 0 && waterOut < 0){
            System.out.println("You can not add negative value.");
            reamingTakenVolume-=waterOut;
        }
        else {
            reamingTakenVolume+=waterOut;
            System.out.println("You can't pour so much water. There is volume for: " + reamingTakenVolume);
        }
        return reamingTakenVolume;
    }

    @Override
    public int transferWater() {
        return 0;
    }
}
