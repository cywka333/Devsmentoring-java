package pl.devsmentoring.java.Streams.Exercise12;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        University university1 = new University("University of Warsaw");
        University university2 = new University("University of Lodz");

        university1.addDepartment(new Department("Department of Mathematics, Informatics and Mechanics")
                .addCourse(new Course("Computer Science"))
                .addCourse(new Course("Mathematics"))
                .addCourse(new Course("Mechanics"))
                .addCourse(new Course("Physics")));

        university1.addDepartment(new Department("Department of Economic Sciences")
                .addCourse(new Course("Economics"))
                .addCourse(new Course("Management"))
                .addCourse(new Course("Finance"))
                .addCourse(new Course("Marketing")));

        university1.addDepartment(new Department("Department of Law and Administration")
                .addCourse(new Course("Law"))
                .addCourse(new Course("Administration"))
                .addCourse(new Course("European Studies"))
                .addCourse(new Course("Political Science")));

        university2.addDepartment(new Department("Department of Mathematics and Computer Science")
                .addCourse(new Course("Computer Science"))
                .addCourse(new Course("Mathematics"))
                .addCourse(new Course("Statistics"))
                .addCourse(new Course("Cryptology")));

        university2.addDepartment(new Department("Department of Philosophy")
                .addCourse(new Course("Philosophy"))
                .addCourse(new Course("History"))
                .addCourse(new Course("Psychology"))
                .addCourse(new Course("Sociology")));

        university2.addDepartment(new Department("Department of Law and Administration")
                .addCourse(new Course("Law"))
                .addCourse(new Course("Administration"))
                .addCourse(new Course("European Studies"))
                .addCourse(new Course("Political Science")));

        List<String> allCourses = Stream.of(university1, university2)
                .flatMap(u -> u.getDepartments().stream())
                .flatMap(d -> d.getCourse().stream())
                .map(Course::getName)
                .distinct()
                .toList();

        System.out.println("All courses offered across all universities and departments:");
        allCourses.forEach(System.out::println);
    }
}