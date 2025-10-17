package models.banking;

public class SavingsAccount extends BankAccount {
    private double interest = 0.0125;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(long accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(long accountNumber, double currentBalance) {
        super(accountNumber, currentBalance);
    }

    @Override
    public void deposit(double amount) {
        this.currentBalance += amount;
    }
;
    public void addInterest() {
        this.currentBalance = this.currentBalance + (this.currentBalance * this.interest);
    }

    public void addInterest(double fixAmount) {
        this.currentBalance += fixAmount;
    }

    @Override
    public String getAccountName() {
        return super.getAccountName() + " - Savings Account";
    }
}
