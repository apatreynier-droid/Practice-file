package Employee;

public class Employee {
    private String name;
    private String jobtitle;
    private double salary;

    public Employee(String name, String jobtitle, double salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;

    }
     public String getName() {
        return name;
    }
    public String getJobTitle() {
        return jobtitle;
    }
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;

    }
    public void setJobTitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }  
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
    public double calculateAnnualSalary() {
        return salary * 12;
    
    }
}
