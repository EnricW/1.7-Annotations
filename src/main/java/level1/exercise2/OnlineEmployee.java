package level1.exercise2;

public class OnlineEmployee extends Employee {
    private static final double INTERNET_ALLOWANCE = 50;

    public OnlineEmployee(String name, String lastName, double salaryPerHour) {
        super(name, lastName, salaryPerHour);
    }

    @Override
    public double calculateSalary(int hours) {
        return super.calculateSalary(hours) + INTERNET_ALLOWANCE;
    }

    @Deprecated
    public void printInternetAllowance() {
        System.out.println("Internet allowance: " + INTERNET_ALLOWANCE);
    }
}
