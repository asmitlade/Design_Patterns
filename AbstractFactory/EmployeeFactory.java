public class EmployeeFactory {
    
    public static Employee createEmployee(AbstractEmployeeFactory aeFactory) {
        return aeFactory.createEmployee();
    }
}
