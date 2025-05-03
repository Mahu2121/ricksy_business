package edu.estatuas;


import java.util.HashMap;

import java.util.Map;

public class UfosPark {

    private Map<String, CreditCard> flota;

    UfosPark() {
        flota = new HashMap<>();
    }

    public void add(String ufo) {
        flota.put(ufo, null);
    }


    public void dispatch(CreditCard cc) {
        if (!cc.isAssigned() && cc.credit() > 500.0){
            for (String ufo : flota.keySet()) {
                if (flota.get(ufo) == null) {
                    cc.payUfo(cc);
                    flota.put(ufo, cc);
                    cc.setAssigned(true);
                    break;
                }
            }
        }
    }

    public String getUfoOf(String number) {
        for (String ufo : flota.keySet()) {
            if (flota.get(ufo) != null && flota.get(ufo).number().equals(number)) {
                return ufo;
            }
        } return null;
    }

    @Override
    public String toString() {
        return "" + flota.keySet() ;
    }

}
