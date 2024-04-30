package models;

import java.util.Date;

public class Payment extends BaseModel{
    private PaymentMode paymentMode;
    private int amount;
    private Date date;
    private PaymentStatus paymentStatus;
    private String refernceNumber;

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRefernceNumber() {
        return refernceNumber;
    }

    public void setRefernceNumber(String refernceNumber) {
        this.refernceNumber = refernceNumber;
    }
}
