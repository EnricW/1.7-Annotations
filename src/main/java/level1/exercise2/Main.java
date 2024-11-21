package level1.exercise2;

public class Main {
    public static void main(String[] args) {
        OnlineEmployee employee1 = new OnlineEmployee("John", "Doe", 10);
        OnsiteEmployee employee2 = new OnsiteEmployee("Jane", "Doe", 10);
        Employee employee3 = new Employee("Jack", "Doe", 10);

        System.out.println(employee1.calculateSalary(10));
        System.out.println(employee2.calculateSalary(10));
        System.out.println(employee3.calculateSalary(10));

        invokeDeprecatedMethod(employee1, employee2);
    }

    @SuppressWarnings("deprecation")
    public static void invokeDeprecatedMethod(OnlineEmployee employee1, OnsiteEmployee employee2) {
        employee1.printInternetAllowance();
        employee2.printGasAllowance();
    }
}
