package Employee;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee("Jhon", "Manager", 6000);
        System.out.println("Name :" + employee.getName());
        System.out.println("Job Title : " + employee.getJobTitle());
        System.out.println("Monthly Salary :" + employee.getSalary());
        System.out.println("Annual Salary : " + employee.calculateAnnualSalary());
        employee.setSalary(6000);
        System.out.println("Updated Salary : " + employee.getSalary());
    }
    
}
