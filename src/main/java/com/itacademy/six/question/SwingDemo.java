package com.itacademy.six.question;

import javax.swing.*;

/**
 * ideja observer dizajn sablona:
 *  subject -> objekat koji emitira neki dogadaj GUI contrlos: JButton
 *  observer -> objekat koji slusa i reaguje na neki dogadaj Event. GUI action listenr: ActionListener
 *  PEONTA JE:
 *      da bi observer konzumirao taj dogadaj on se mora subsrcibe
 *
 *      JButton(observable/subject) ---generise ---ActionEvent event --- konzymiraju ----> AngelListener, DveilListener
 *
 *      observeri ili posmatraci - > i jedan i drugi predstavljaju observere koji konzumiraju event
 *
 *      U PITANJU SU TRI OBSERVER I JEDAN SUBJEKAT PROMATRANJA .. OBJEKAT KREIRAN PO SABLONU NEKE KLASE
 */
public class SwingDemo {
    public static void main(String[] args) {
        //dobrra ili losa // subject/observable
        //Subject -> generise ActionEvent -> event je kanal komunikacije izmedu onoga ko generise i onoga ko konzumira
        //event
        JButton actionButton = new JButton("action dugme");
        actionButton.setActionCommand("do something");

        //observer A
        AngelListener angelListener = new AngelListener();

        //observer B
        DevilListener devilListener = new DevilListener();

        actionButton.addActionListener(angelListener);
        actionButton.addActionListener(devilListener);
        actionButton.addActionListener(new SelfMadeLisstener());

        JFrame frame = new JFrame("observer example");
        frame.add(actionButton);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
