package edu.estatuas;


import java.util.HashMap;

import java.util.Map;

public class UfosPark {
    private Map<String, CreditCard> flota;

    UfosPark() {
        flota = new HashMap<>();
    }

    public void add(String ufo) {
        flota.put(ufo,null);
    }


    public void dispatch(CreditCard cc) {
        for (String ufo : flota.keySet()) {
            if (flota.get(ufo) == null) {
                cc.setCredit(cc.credit());
                flota.put(ufo,cc);
                break;
            }
        }
    }

    public String getUfoOf(String number) {
        for (String ufo : flota.keySet()) {
            if (flota.get(ufo).number().equals(number)) {
                return ufo;
            }
        } return null;
    }



}
