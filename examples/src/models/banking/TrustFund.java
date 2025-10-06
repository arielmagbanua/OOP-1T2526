package models.banking;

public class TrustFund extends SavingsAccount {

    @Override
    public void addInterest(double fixAmount) {
        this.currentBalance = this.currentBalance + fixAmount + 10;
    }

    public String getAccountName() {
        return "TrustFund-01";
    }
}
