package com.itacademy.two.file;

import com.itacademy.two.exception.TextFileNotFoundException;

import javax.swing.*;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {

        //try {} pokusat cemo
        //catch (greska){blok koda koji ce odreagirati na tu gresku}
        //compile error -> provjeravani exception
        System.out.println("unesite ime fajla");
        Scanner consoleScanner = new Scanner(System.in);
        String filePath = new Scanner(System.in).nextLine();
        TextFileReader textFileReader = new TextFileReader();
        try {
            System.out.println("pocinjemo sa citnjm fajla");
            textFileReader.readFile(filePath);
            System.out.println("nije se desio problem. Fajl je procitan i ne ulazimo u catch nego nastavljamo");
        }catch (TextFileNotFoundException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
        System.out.println("program zavrsio");
    }
}
