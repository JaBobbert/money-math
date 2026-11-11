package com.pluralsight;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {
        float numb1 = 0;
        double numb2 = 0;
        BigDecimal numb3 = BigDecimal.ZERO;

        BigDecimal tenCents = new BigDecimal("0.10");

        System.out.println("Adding 10 cents 10 times.");

        for (int i = 1; i<=10; i++){
            numb1 += .10;
            numb2 += .10;

            numb3 = numb3.add(tenCents);

            System.out.println();
            System.out.println("float: " + numb1);
            System.out.println("double: " + numb2);
            System.out.println("bigDecimal: " + numb3);

        }


    }
}
