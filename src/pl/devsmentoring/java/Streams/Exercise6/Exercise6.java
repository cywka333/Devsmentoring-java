package pl.devsmentoring.java.Streams.Exercise6;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API" ,
                                        "Microservices", "AWS", "microservices", "Docker", "Kubernetes");

        List<String> springCourses = courses.stream()
                                                    .filter(course -> course.toLowerCase().contains("spring"))
                                                    .collect(Collectors.toList());

        List<String> fourLettersCourses = courses.stream()
                                                          .filter(course -> course.length() >= 4)
                                                          .collect(Collectors.toList());

        System.out.println("Courses that contains word 'spring' " + springCourses);
        System.out.println("Courses that have at least 4 characters " + fourLettersCourses);

    }
}
