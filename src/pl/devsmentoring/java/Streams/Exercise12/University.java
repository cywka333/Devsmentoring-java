package pl.devsmentoring.java.Streams.Exercise12;

import java.util.ArrayList;
import java.util.List;

class University {

    private String name;
    private List<Department> departments = new ArrayList<>();

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public University(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }


    public University addDepartment(Department department) {
        this.departments.add(department);
        return this;
    }
    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}