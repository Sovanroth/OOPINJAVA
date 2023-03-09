package Employee;

public class MainEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Anakin", "Skywalker", 5000.0);
        Employee employee2 = new Employee("Darth", "Vader", 6000.0);
        System.out.printf("%s %s's yearly salary is %.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary is %.2f%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
        employee1.raiseSalary(10);
        employee2.raiseSalary(10);
        System.out.printf("%s %s's yearly salary after a 10%% raise is %.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary after a 10%% raise is %.2f%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
    }
}
