package edu.estatuas;

public class CreditCard {
    private String name;
    private String number;
    private double credit = 3000.0;


    CreditCard(String name, String number) {
        this.name = name;
        this.number = number;
    }

    private String getName() {
        return name;
    }

    private String getNumber() {
        return number;
    }

    private double getCredit() {
        return credit;
    }

    public String number() {
        return number;
    }

    @Override
    public String toString() {
        return "owner:" + getName() + "\n" + "number:" + getNumber() + "\n" + "credit:" + getCredit();
    }



}
