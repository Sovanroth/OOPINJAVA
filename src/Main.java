public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("1", "Gum", 0, 0);
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        System.out.println("=========================================================================================");

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

        System.out.println("=========================================================================================");

        Date date = new Date(3, 9, 2023);
        date.displayDate();
        date.setMonth(4);
        date.setDay(1);
        date.setYear(2024);
        date.displayDate();

        System.out.println("=========================================================================================");


    }
}
