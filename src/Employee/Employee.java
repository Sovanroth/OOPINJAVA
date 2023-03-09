package Employee;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void raiseSalary(double percentage) {
        double raiseAmount = monthlySalary * percentage / 100;
        monthlySalary += raiseAmount;
    }
}
