package edu.estatuas;

public class CreditCard {
    private String name;
    private String number;
    private double credit = 3000.0;
    private Boolean assigned = false;


    CreditCard(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public double getCredit() {
        return credit;
    }

    public String number() {
        return number;
    }

    public double credit() {
        return credit;
    }

    public Boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(Boolean assigned) {
        this.assigned = assigned;
    }

    public void payUfo(CreditCard credit) {
        this.credit = credit.credit() - 500.0;
    }

    public void payPack(CreditCard credit) {
        this.credit = credit.credit() - 50.0;
    }

    public void pay(double money) {
        credit = credit - money;
        if (credit < 0) {
            credit = 0.0;
        }
    }

    @Override
    public String toString() {
        return "owner:" + getName() + "\n" + "number:" + getNumber() + "\n" + "credit:" + getCredit();
    }



}
