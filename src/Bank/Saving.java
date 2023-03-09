package Bank;
public class Saving extends Bank {
    double savRate; //percent interest rate per year

    public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
        this.savRate = savRate;
    }

    public double calcBalance() {
        return curBal + (savRate * curBal);
    }
}

