package LLD.CourseRegistrationSystem;

import java.util.*;

public class CourseManager {
    List<Course> allCourseList;
    public static CourseManager instance;
    Map<String, List<Student>> courseToStudentMap;
    public CourseManager() {
        allCourseList = new ArrayList<>();
    }
    public static synchronized CourseManager getInstance() {
        if (instance == null) instance = new CourseManager();
        return instance;
    }
    public List<Course> getAllCourseList() {
        return allCourseList;
    }
    public void addCourse(List<Course> courses) {
        allCourseList.addAll(courses);
    }
    public void removeCourseById(String id) {
        for (Course course : allCourseList) {
            if (course.getId().equalsIgnoreCase(id)) {
                allCourseList.remove(course);
                break;
            }
        }
    }
    public Course getCourseById(String courseId) {
        for (Course course : allCourseList) {
            if (course.getId().equalsIgnoreCase(courseId)) {
                return course;
            }
        }
        return null;
    }

}
