package pl.devsmentoring.java.Streams.Exercise12;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;

    private List<Course> courses = new ArrayList<>();

    public Department(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public Department addCourse(Course course) {
        this.courses.add(course);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourse() {
        return courses;
    }

}