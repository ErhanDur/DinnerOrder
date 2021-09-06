package com.erhandur.main;

import com.erhandur.domain.*;

public class Main {
    public static void main(String[] args) {

        DinnerOrder.Builder builder = new DinnerOrder.Builder();
        builder.bread("Bran").dressing("Mayo").meat("Turkey").condiments("Salt");

        DinnerOrder dinnerOrder=builder.build();

        System.out.println(dinnerOrder);
    }





}
