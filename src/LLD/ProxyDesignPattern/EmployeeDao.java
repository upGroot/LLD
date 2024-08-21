package LLD.ProxyDesignPattern;

public interface EmployeeDao {
    public void addEmployee(String client, Employee e);
    public void removeEmployee(String client, Employee e);
    public Employee getEmployee(String client, int empId);
}
