package edu.estatuas;

public class RickMenu implements GuestDispatcher{

    private int menuCost;
    private int menuStock;


    RickMenu(int menuCost, int menuStock) {
        this.menuCost = menuCost;
        this.menuStock = menuStock;

    }

    public int getMenuStock() {
        return menuStock;
    }

    @Override
    public void dispatch(CreditCard creditCard) {
        if (creditCard.credit() > this.menuCost && menuStock > 0) {
            creditCard.payMenu(creditCard,menuCost);
            menuStock -= 1;
        }
    }
}
