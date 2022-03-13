package org.drools.examples.banking;

public class CustomBank {
    private String bankName;
    private double bankBalance;
    private int ID;

    public CustomBank() {
    }

    public CustomBank(String bankName, double bankBalance, int ID) {
        this.bankName = bankName;
        this.bankBalance = bankBalance;
        this.ID = ID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return getBankName();
    }
}
