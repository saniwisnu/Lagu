package com.company;

/**
 * Created by VAIO on 6/10/2015.
 */
public class TestLagu {
    public static void main(String[] args) {
       pencipta Bane = new pencipta("Bane","Australia");
        System.out.println(Bane.toString());
        Lagu Callinghours = new Lagu("callinghours","Hardcore",4.20,Bane);
        System.out.println(Callinghours.toString());
    }
}
