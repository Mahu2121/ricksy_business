package edu.estatuas;
import java.util.ArrayList;

public class Receptivo implements GuestDispatcher {
    private ArrayList<GuestDispatcher> dispatchers;

    Receptivo() {
        dispatchers = new ArrayList<>();
    }


    public void registra(GuestDispatcher guest) {
        this.dispatchers.add(guest);
    }

    @Override
    public void dispatch(CreditCard creditCard) {
        for (GuestDispatcher guest : dispatchers) {
            guest.dispatch(creditCard);
        }
    }






}
