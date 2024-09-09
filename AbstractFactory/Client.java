public class Client {
    public static void main(String[] args) {
        
        Employee emp = EmployeeFactory.createEmployee(new WebDeveloperFactory());
        System.out.println(emp.name()+ " : "+emp.salary());
    }
}
