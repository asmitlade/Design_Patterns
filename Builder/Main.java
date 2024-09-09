public class Main {
    public static void main(String[] args) {
    Employee emp = new Employee.EmployeeBuilder()
                    .setEmpId(123)
                    .setEmpName("Asmit")
                    .setSalary(1234)
                    .build();
        System.out.println(emp);
    
    }
}
