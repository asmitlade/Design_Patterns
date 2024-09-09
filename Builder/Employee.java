class Employee {

    private final int empId;
    private final String empName;
    private final int salary;

    
    public Employee(EmployeeBuilder builder) {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.salary = builder.salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    

   @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
    }


static class EmployeeBuilder {
        private int empId;
        private String empName;
        private int salary;

        public EmployeeBuilder() {

        }

        public EmployeeBuilder setEmpId(int empId) {
            this.empId = empId;
            return this;
        }
        public EmployeeBuilder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }
        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            Employee emp = new Employee(this);
            return emp;
        }
        
    }
    
}