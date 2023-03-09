package Bank;
public class Current extends Bank {
    boolean fixedDep; //whether the customer keeps the fixed deposit with the bank of not
    double curRate; //percent interest rate per year

    public Current(String accNo, String custName, int custGender, String custJob, double curBal, boolean fixedDep, double curRate) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
        this.fixedDep = fixedDep;
        this.curRate = curRate;
    }

    public double calcBalance() {
        if (fixedDep) {
            curBal -= 150; // Deduct service fee for fixed deposit
        }
        return curBal + (curRate * curBal);
    }
}

