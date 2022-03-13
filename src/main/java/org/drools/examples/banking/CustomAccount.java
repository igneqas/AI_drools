package org.drools.examples.banking;

public class CustomAccount {
    private long   accountNo;
    private double balance = 0;
    private CustomBank bank;

    public CustomAccount() {
    }

    public CustomAccount(long accountNo, CustomBank bank) {
        this.accountNo = accountNo;
        this.bank = bank;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CustomBank getBank() {
        return bank;
    }

    public void setBank(CustomBank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return getBank().getBankName();
    }

    /*public String toString() {
        return "Account[" + "accountNo=" + accountNo + ",balance=" + balance + "]";
    }*/
}
