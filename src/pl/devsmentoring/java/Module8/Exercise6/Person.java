package pl.devsmentoring.java.Module8.Exercise6;

public class Person {

    private final Address address;
    protected final String name;
    protected final String phoneNumber;
    protected final String emailAddress;

    public Person(Address address, String name, String phoneNumber, String emailAddress) {
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    protected void purchaseParkingPass(){
        System.out.println("You purchased parking ticket!");
    }

}