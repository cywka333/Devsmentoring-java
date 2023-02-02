package pl.devsmentoring.java.TestOOP;

abstract class Tank {
    protected String name;
    protected int length = 1;
    protected int width = 1;
    protected int height = 1;
    protected int r = 1;


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

    protected void displayVolume(){
        if (length <= 0 || width <= 0 || height <= 0 || r <= 0)
        {
            System.out.println("It is impossible to create negative figure.");
        }
        else if (name.equals("")){
            System.out.println("Your tank does not have a name, but it hase volume: " + calculateVolume());
        } else {
            System.out.println("Volume of your: " + name + " is equal to: " + calculateVolume());
        }
    }

}




