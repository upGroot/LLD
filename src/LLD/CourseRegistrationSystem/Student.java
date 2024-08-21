package LLD.CourseRegistrationSystem;

import java.util.*;

public class Student {
    private String id;
    private String name;
    private List<Course> coursesEnrolled;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        coursesEnrolled = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(List<Course> coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }
}
