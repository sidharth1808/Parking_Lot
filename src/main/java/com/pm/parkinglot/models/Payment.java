package com.pm.parkinglot.models;

import java.util.Date;

public class Payment {
    private int amount;
    private String refernceNumber;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;

    private Date time;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getRefernceNumber() {
        return refernceNumber;
    }

    public void setRefernceNumber(String refernceNumber) {
        this.refernceNumber = refernceNumber;
    }
}
