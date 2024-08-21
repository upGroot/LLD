package LLD.CourseRegistrationSystem;

public class Main {
    public static void main(String[] args) throws Exception {
      CRSystem demo = new CRSystem();
      try{
          demo.getAllAvailableCourses();
          demo.enroll("1001", "2001");
          demo.enroll("1002", "2001");
          demo.enroll("1003", "2001");
          demo.enroll("1004", "2001");
          demo.enroll("1001", "2002");
      }
      catch (Exception e) {
          System.out.println(e.getMessage());
      }
      demo.enrolledCourseByStudent("1001");
    }
}
