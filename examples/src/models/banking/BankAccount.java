package models.banking;

public abstract class BankAccount {
    protected long accountNumber;
    protected double currentBalance = 100.0;

    public BankAccount() {
        this.accountNumber = 0;
        this.currentBalance = 0.0;
    }

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(long accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return this.currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getBalance() {
        return this.currentBalance;
    }

    public String getAccountName() {
        return "BankAccount-01";
    }

    public abstract void deposit(double amount);
}
