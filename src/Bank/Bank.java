package Bank;
public abstract class Bank {
    String accNo; //customer account number with Bank
    String custName; //customer name
    int custGender; //customer gender –  1 = Male, 2 =Female
    String custJob; //customer job position
    double curBal; //customer balance in the bank account

    public abstract double calcBalance();

    public String toString() {
        return "Account Number: " + accNo + "\n" +
                "Customer Name: " + custName + "\n" +
                "Gender: " + (custGender == 1 ? "Male" : "Female") + "\n" +
                "Job Position: " + custJob + "\n" +
                "Current Balance: RM" + curBal + "\n";
    }
}
