package pl.devsmentoring.java.Module8.Exercise6;

public class Main {

    public static void main(String[] args) {

        Address studentJanAdress = new Address("Jan Street", "Chicago", "Illinois", 86555, "USA");
        Address studentKrzysztofAddress = new Address("Krzysztof Street", "New York", "New York", 99100, "USA");
        Address professorAndrzejAddress = new Address("Professional Street", "San Francisco", "California", 88777, "USA");


        Student studentKrzysztof = new Student(studentJanAdress, "Krzysztof", "888999333", "email@email.com", 55610, 4);
        Student studentJan = new Student(studentKrzysztofAddress,"Jan", "888555666", "kakakak@mmm.pl", 59140, 2);
        Student studentPiotr = new Student("Piotr", "666333222", "piotr@piotr.pl", 44300, 3);

        Professor professorAndrzej = new Professor(professorAndrzejAddress, "Andrzej", "999888777", "andrzejpoczta@andrzej.pl", 44000.96);
        Professor professorBaltazar = new Professor("Baltazar", "222333222", "baltazar@baltazar.pl", 11200.02);

        studentJan.execute();
        studentKrzysztof.execute();
        studentPiotr.execute();
        professorAndrzej.execute();
        professorBaltazar.execute();

    }
}