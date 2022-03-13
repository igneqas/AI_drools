package org.drools.examples.banking;

import java.util.Date;

public class CustomCashflow{
    public static final int TRANSFER = 0;
    public static final int DEPOSIT  = 1;
    public static final int WITHDRAWAL  = 2;

    private int type;

    private Date date;

    private double amount;

    private CustomAccount sender;

    private CustomAccount receiver;

    private int receivingBank;

    private int sendingBank;

    public CustomCashflow() {
    }

    public CustomCashflow(int type, Date date, double amount, CustomAccount sender, CustomAccount receiver) {
        this.type = type;
        this.date = date;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        setReceivingBank(receiver.getBank().getID());
        this.sendingBank = sender.getBank().getID();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CustomAccount getSender() {
        return sender;
    }

    public void setSender(CustomAccount sender) {
        this.sender = sender;
    }

    public CustomAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(CustomAccount receiver) {
        this.receiver = receiver;
    }

    public int getReceivingBank() {
        return receivingBank;
    }

    public void setReceivingBank(int receivingBank) {
        this.receivingBank = receivingBank;
    }

    public int getSendingBank() {
        return sendingBank;
    }

    public void setSendingBank(int sendingBank) {
        this.sendingBank = sendingBank;
    }

    @Override
    public String toString() {
        return "CustomCashflow{" +
                "type=" + type +
                ", date=" + date +
                ", amount=" + amount +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}
