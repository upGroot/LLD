package LLD.CourseRegistrationSystem;

import java.util.*;

public class StudentManager {
    public static StudentManager instance;
    List<Student> studentList;
    public StudentManager() {
        studentList = new ArrayList<>();
    }
    public static synchronized StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }
    public Student getStudentById(String id) {
        for (Student student : studentList) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }
    public void updateStudentCourse(String studentId, Course enrolledCourse) {
        Student student = getStudentById(studentId);
        List<Course> coursesEnrolled = getAllCourseByStudent(student);
        coursesEnrolled.add(enrolledCourse);
        student.setCoursesEnrolled(coursesEnrolled);
    }
    public List<Course> getAllCourseByStudent(Student student) {
        return student.getCoursesEnrolled();
    }
    public void addStudent(List<Student> students) {
        studentList.addAll(students);
    }
}
