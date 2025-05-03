package edu.estatuas;

public class CrystalExpender implements GuestDispatcher {
    private int stock;
    private double itemCost;

    CrystalExpender(int stock, int itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public int stock() {
        return stock;
    }

    @Override
    public void dispatch(CreditCard creditCard) {
        if (creditCard.credit() > this.itemCost) {
            creditCard.payPack(creditCard);
            stock -= 1;
        }
    }

    @Override
    public String toString() {
        return "stock: " + stock + "\n" + "cost: " + itemCost;
    }

}
