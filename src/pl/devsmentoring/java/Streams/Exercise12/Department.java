package pl.devsmentoring.java.Streams.Exercise12;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;

    private final List<Course> courses;


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