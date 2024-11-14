package level1.exercise1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new OnlineEmployee("John", "Doe", 10);
        Employee employee2 = new OnsiteEmployee("Jane", "Doe", 10);
        Employee employee3 = new Employee("Jack", "Doe", 10);

        System.out.println(employee1.calculateSalary(10));
        System.out.println(employee2.calculateSalary(10));
        System.out.println(employee3.calculateSalary(10));
    }
}
