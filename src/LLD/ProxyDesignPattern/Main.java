package LLD.ProxyDesignPattern;

public class Main {
    public static void main(String[] args){
        Employee e1 = new Employee(1, "Ayush");
        Employee e2 = new Employee(2, "Amit");
        EmployeeDao employeeProxy = new EmployeeProxy();
        employeeProxy.addEmployee("ADMIN", e1);
        employeeProxy.addEmployee("USER", e2);
        employeeProxy.getEmployee("USER", 1);
    }
}
