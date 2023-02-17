package pl.devsmentoring.java.Streams.Exercise12;

import java.util.ArrayList;
import java.util.List;

class University {

    private final String name;
    private final List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }
    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}