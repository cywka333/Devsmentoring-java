package pl.devsmentoring.java.TestOOP;

abstract class Tank {
    protected String name;
    protected int length = 1;
    protected int width = 1;
    protected int height = 1;
    protected int r = 1;
    protected double maxValue;
    protected double reamingVolume;

    // walec
    public Tank(String name, int height, int r) {
        this.name = name;
        this.height = height;
        this.r = r;
    }

    //kula
    public Tank(String name, int r){
        this.name = name;
        this.r = r;
    }

    //prostopadłościan i szescian
    public Tank(String name, int length, int width, int height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    abstract double calculateVolume();

    protected void waterLimit(){
        System.out.println("Your water limit is: " + this.maxValue);
    }

    protected void displayVolume(){
        if (length <= 0 || width <= 0 || height <= 0 || r <= 0)
        {
            System.out.println("It is impossible to create negative figure.");
        }
        else if (this.name.equals("")){
            System.out.println("Your tank does not have a name, but it has volume: " + calculateVolume());
        } else {
            System.out.println("Volume of your: " + this.name + " is equal to: " + calculateVolume());
        }
    }

    protected double pourWater(double waterAdd) {
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
        } else {
            System.out.println("Operation failed. You can't pour so much water. You pour over: " +-reamingFreeVolume);
            reamingFreeVolume+=waterAdd;
            this.maxValue=reamingFreeVolume;

        }
        return reamingFreeVolume;
    }

    protected double pourOutWater(double waterOut) {
        double reamingToTakeVolume = this.reamingVolume + waterOut;
        if (waterOut > reamingVolume){
            reamingToTakeVolume-=waterOut;
            System.out.println("You can not pour so much water! You can pour out max: " + reamingToTakeVolume);
        } else if (waterOut < 0) {
            reamingToTakeVolume -= waterOut;
            System.out.println("Operation failed. You can not pour out negative number. Please write positive number.");
            System.out.println("Reaming free value of " + this.name + " is: " + reamingToTakeVolume);
            this.reamingVolume = reamingToTakeVolume;
        }else if (reamingToTakeVolume < calculateVolume() && waterOut >=0){
            System.out.println("You are pouring out water from: " + this.name + ". You taken: " + waterOut + " of water. You have: " + reamingToTakeVolume + " free volume now.");
            this.reamingVolume = reamingToTakeVolume;
        } else if (reamingToTakeVolume < calculateVolume() && waterOut >=0) {
            System.out.println("Coś");
        }
        return reamingToTakeVolume;
    }

    public int transferWater(Tank tank) {
        return 0;
    }

}

