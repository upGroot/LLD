package LLD.CourseRegistrationSystem;

public class Course {
    private String id;
    private String name;
    private String courseInstructor;
    private int maxCapacity;

    public Course(String id, String name, String courseInstructor, int maxCapacity) {
        this.id = id;
        this.name = name;
        this.courseInstructor = courseInstructor;
        this.maxCapacity = maxCapacity;
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

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
