package pl.devsmentoring.java.Streams.Exercise12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        University university1 = new University("University of Warsaw");
        University university2 = new University("Jagiellonian University");

        university1.addDepartment(new Department("Faculty of Mathematics, Informatics and Mechanics")
                .addCourse(new Course("Computer Science"))
                .addCourse(new Course("Mathematics"))
                .addCourse(new Course("Mechanics"))
                .addCourse(new Course("Physics")));

        university1.addDepartment(new Department("Faculty of Economic Sciences")
                .addCourse(new Course("Economics"))
                .addCourse(new Course("Management"))
                .addCourse(new Course("Finance"))
                .addCourse(new Course("Marketing")));

        university1.addDepartment(new Department("Faculty of Law and Administration")
                .addCourse(new Course("Law"))
                .addCourse(new Course("Administration"))
                .addCourse(new Course("European Studies"))
                .addCourse(new Course("Political Science")));

        university2.addDepartment(new Department("Faculty of Mathematics and Computer Science")
                .addCourse(new Course("Computer Science"))
                .addCourse(new Course("Mathematics"))
                .addCourse(new Course("Statistics"))
                .addCourse(new Course("Cryptology")));

        university2.addDepartment(new Department("Faculty of Philosophy")
                .addCourse(new Course("Philosophy"))
                .addCourse(new Course("History"))
                .addCourse(new Course("Psychology"))
                .addCourse(new Course("Sociology")));

        university2.addDepartment(new Department("Faculty of Law and Administration")
                .addCourse(new Course("Law"))
                .addCourse(new Course("Administration"))
                .addCourse(new Course("European Studies"))
                .addCourse(new Course("Political Science")));

        List<Course> allCourses = Arrays.asList(university1, university2).stream()
                .flatMap(u -> u.getDepartments().stream())
                .flatMap(d -> d.getCourse().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("All courses offered across all universities and departments:");
        allCourses.forEach(course -> System.out.println(course.getName()));
    }
}