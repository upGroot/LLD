package LLD.ProxyDesignPattern;

public class EmployeeProxy implements EmployeeDao{
    EmployeeDao employeeDao;
    EmployeeProxy() {
        employeeDao = new EmployeDaoImp();
    }
    @Override
    public void addEmployee(String client, Employee e) {
        if(client.equals("ADMIN"))
            employeeDao.addEmployee(client, e);
        else
            System.out.println("ACCESS DENIED");
    }

    @Override
    public void removeEmployee(String client, Employee e) {
        if(client.equals("ADMIN"))
            employeeDao.removeEmployee(client, e);
        else
            System.out.println("ACCESS DENIED");
    }

    @Override
    public Employee getEmployee(String client, int empId) {
        if(client.equals("ADMIN") || client.equals("USER"))
            return employeeDao.getEmployee(client, empId);
        else
            System.out.println("ACCESS DENIED");
        return null;
    }
}
