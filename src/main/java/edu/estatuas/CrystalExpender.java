package edu.estatuas;

public class CrystalExpender implements GuestDispatcher {
    private int stock;
    private double itemCost;

    CrystalExpender(int stock, int itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    @Override
    public void dispatch(CreditCard creditCard) {
        creditCard.payPack(creditCard);
    }

    @Override
    public String toString() {
        return "stock: " + stock + "\n" + "cost: " + itemCost;
    }

}
