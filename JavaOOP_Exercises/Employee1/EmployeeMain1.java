package Employee1;

import java.time.LocalDate;
public class EmployeeMain1 {
    public static void main(String[] args) {
        Employee1 e = new Employee1("John", 50000, LocalDate.of(2020, 1, 1));
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Hire Date: " + e.getHireDate());
        System.out.println("Years of Service: " + e.calculateYearsOfService());
        
        e.setName("John Smith");
        e.setSalary(55000);
        System.out.println("Updated Name: " + e.getName());
        System.out.println("Updated Salary: " + e.getSalary());
        System.out.println("Updated Years of Service: " + e.calculateYearsOfService());
    }
}
