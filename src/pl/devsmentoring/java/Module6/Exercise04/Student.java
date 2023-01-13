package pl.devsmentoring.java.Module6.Exercise04;

public class Student {
    String studentName;
    int studentAge;
    int studentHeight;
    String studentSchool;

    void displayStudentInformation(){
        System.out.println("Student name is: " + studentName);
        System.out.println("Student age is: " + studentAge);
        System.out.println("Student height is: " + studentHeight);
        System.out.println("Student school is: " + studentSchool);
    }

    String getName(){
        return studentName;
    }

    int getStudentAge(){
        return studentAge;
    }

    int getStudentHeight(){
        return studentHeight;
    }

    String getStudentSchool(){
        return studentSchool;
    }

    void setStudentName(String studentName){
        this.studentName = studentName;
    }

    void setStudentAge(int studentAge){
        this.studentAge = studentAge;
    }

    void setStudentHeight(int studentHeight){
        this.studentHeight = studentHeight;
    }

    void setStudentSchool(String studentSchool){
        this.studentSchool = studentSchool;
    }
}
