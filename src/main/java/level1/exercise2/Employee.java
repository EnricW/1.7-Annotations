package level1.exercise2;

public class Employee {
    private String name;
    private String lastName;
    private double salaryPerHour;

    public Employee(String name, String lastName, double salaryPerHour) {
        this.name = name;
        this.lastName = lastName;
        this.salaryPerHour = salaryPerHour;
    }

    public double calculateSalary(int hours) {
        return salaryPerHour * hours;
    }
}
