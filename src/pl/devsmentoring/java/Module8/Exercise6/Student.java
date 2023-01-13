package pl.devsmentoring.java.Module8.Exercise6;

public class Student extends Person {
    private final int studentNumber;
    private int averageMark;

    public Student(Address address, String name, String phoneNumber, String emailAddress, int studentNumber, int averageMark) {
        super(address, name, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    private void isEligibleToEnrollGetSeminarTokens() {
        if (this.averageMark >= 3) {
            System.out.println("Student is eligible to enroll and get seminar tokens!");
        }else {
            System.out.println("Student is not eligible to enroll and get seminar tokens! :(");
        }
    }

    @Override
    protected void purchaseParkingPass() {
        super.purchaseParkingPass();
        System.out.println("You are a student!\n");
    }

    public void execute(){
        isEligibleToEnrollGetSeminarTokens();
        purchaseParkingPass();
    }
}