package com.itacademy.six.question;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//ova actionPerformed metoda je metoda koja reaguje na dogadaj koji se desio

/**
 * ako se po sablou ove klase kreira objekat
 */
public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("radi dobro djelo");


    }
}
