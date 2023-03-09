package Bank;

import java.util.ArrayList;

public class BankSystem {
    private ArrayList<Bank> customers = new ArrayList<>();

    public void addCustomer(Bank customer) {
        customers.add(customer);
    }

    public Bank searchCustomer(String accNo) {
        for (Bank customer : customers) {
            if (customer.accNo.equals(accNo)) {
                return customer;
            }
        }
        System.out.println("Customer with account number " + accNo + " not found.");
        return null;
    }

    public int countConcurrentCustomers() {
        int count = 0;
        double totalBalance = 0;
        for (Bank customer : customers) {
            if (customer instanceof Current || customer instanceof Saving) {
                count++;
                totalBalance += customer.calcBalance();
            }
        }
        System.out.println("Total balance of concurrent customers: RM" + totalBalance);
        return count;
    }
}
