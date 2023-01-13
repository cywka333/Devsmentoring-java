package pl.devsmentoring.java.Module8.Exercise6;

public class Professor extends Person{
    private double salaryProfessor;

    @Override
    protected void purchaseParkingPass() {
        super.purchaseParkingPass();
        System.out.println("You are a professor!");
    }

    public Professor(Address address, String name, String phoneNumber, String emailAddress, double salaryProfessor) {
        super(address, name, phoneNumber, emailAddress);
        this.salaryProfessor = salaryProfessor;
    }

    private void execute(){
        purchaseParkingPass();
    }
}
