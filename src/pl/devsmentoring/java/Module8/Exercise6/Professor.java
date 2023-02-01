package pl.devsmentoring.java.Module8.Exercise6;

public class Professor extends Person{
    private final double salaryProfessor;

    @Override
    protected void purchaseParkingPass() {
        super.purchaseParkingPass();
        System.out.println("You are a professor!\n");
    }

    public Professor(Address address, String name, String phoneNumber, String emailAddress, double salaryProfessor) {
        super(address, name, phoneNumber, emailAddress);
        this.salaryProfessor = salaryProfessor;
    }

    public Professor(String name, String phoneNumber, String emailAddress, double salaryProfessor) {
        super(name, phoneNumber, emailAddress);
        this.salaryProfessor = salaryProfessor;
    }

    public void execute(){
        System.out.println("Professor name: " + this.name);
        System.out.println("Salary: " + this.salaryProfessor);
        purchaseParkingPass();
    }
}
