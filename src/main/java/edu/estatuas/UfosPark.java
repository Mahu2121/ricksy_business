package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class UfosPark {
    private List<String> flota;

    UfosPark() {
        flota = new ArrayList<String>();
    }

    public void add(String ufo) {
        flota.add(ufo);
    }

    public void dispatch(CreditCard cc) {
        flota.add(cc.number())  ;
        flota.remove(flota.size() - 1);
    }

    public String getUfoOf(String number) {
        for (int i = 0; i < flota.size(); i++) {
            if (flota.get(i).contains(number)) {
                return flota.get(i);
            }
        }
        return null;
    }




}
