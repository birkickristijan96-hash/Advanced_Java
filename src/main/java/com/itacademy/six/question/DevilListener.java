package com.itacademy.six.question;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//konzumira ActionEvent
public class DevilListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        //pretplatnik na ovaj tip dogadaja
        String actionCommand = event.getActionCommand();
        System.out.println("komanda je :" + actionCommand);
        System.out.println("ucini lose");
    }
}
