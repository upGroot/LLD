package LLD.CourseRegistrationSystem;

import java.util.*;

public class CRSystem {
    StudentManager studentManager;
    CourseManager courseManager;
    Map<String, List<String>> courseToStudentMap;
    public CRSystem() {
        studentManager = StudentManager.getInstance();
        courseManager = CourseManager.getInstance();
        courseToStudentMap = new HashMap<>();
        initialize();
    }
    public boolean validateIfEnrollmentPossible(Course course) {
        if (courseToStudentMap.get(course.getId()) == null) return true;
        return course.getMaxCapacity() > courseToStudentMap.get(course.getId()).size();
    }
    public void getAllAvailableCourses() {
        List<Course> allCourses = courseManager.getAllCourseList();
        for (Course course : allCourses) {
            System.out.println("Course name : " + course.getName() +
                    " --------------- Course Instructor : " + course.getCourseInstructor());
        }
        System.out.println("*****************************************");
    }
    public synchronized void enroll(String studentId, String courseId) throws Exception{
        Course courseEnrolled = courseManager.getCourseById(courseId);
        if (validateIfEnrollmentPossible(courseEnrolled))  {
            studentManager.updateStudentCourse(studentId, courseEnrolled);
            courseToStudentMap.putIfAbsent(courseId, new ArrayList<>());
            courseToStudentMap.get(courseId).add(studentId);
        }
        else throw new Exception("Enrollment is full in this course");
    }
    public void enrolledCourseByStudent(String studentId) {
        Student student = studentManager.getStudentById(studentId);
        List<Course> allEnrolledCourses = studentManager.getAllCourseByStudent(student);
        System.out.println("All enrolled courses by " + student.getName() + " are : ");
        for (Course course : allEnrolledCourses) {
            System.out.println("Course name : " + course.getName() +
                     " ------------- Course Instructor : " + course.getCourseInstructor());
        }
        System.out.println("*****************************************");
    }
    public void initialize() {
        Student s1 = new Student("1001", "Ayush");
        Student s2 = new Student("1002", "Aman");
        Student s3 = new Student("1003", "Amit");
        Student s4 = new Student("1004", "Shikha");
        Student s5 = new Student("1005", "Ram");
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        studentManager.addStudent(students);
        Course c1 = new Course("2001", "DSA in Java", "Ajit Mishra", 3);
        Course c2 = new Course("2002", "DSA in Python", "Arvind Pandey", 2);
        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courseManager.addCourse(courses);

    }
}
