public class Main {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getInstance("App");
        System.out.println(emp.salary());
    }
}
