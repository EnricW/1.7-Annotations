package level1.exercise2;

public class OnsiteEmployee extends Employee {
    private static double gasAllowance = 100.0;

    public OnsiteEmployee(String name, String lastName, double salaryPerHour) {
        super(name, lastName, salaryPerHour);
    }

    @Override
    public double calculateSalary(int hours) {
        return super.calculateSalary(hours) + gasAllowance;
    }

    @Deprecated
    public void printGasAllowance() {
        System.out.println("Gas allowance: " + gasAllowance);
    }
}
