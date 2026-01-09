package com.itacademy.third.io;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/**
 *
 * NESTATICNA METODA FUNKCIJA ITD POTREBNO JE TAD KREIRATI OBJEKAT I TEK ONDA POZVATI FUNKCIJU
 * YNACI POTREBNO JE KREIRATI OBJEKAT PO SABLONU KLASE
 * SABLON JE ONO GDJE KLASI DAJEMO SVOJSTVA POLJA METODE  KONSTRUKTOR KOJI CE KONSTRUIRATI OBJEKAT ITD
 *
 * prilikom citanja fajla: FileInputStream
 * prilikom pisanja u fajl: FileOutputStream
 *
 * Exception -< IOException <- FileNotFoundException
 *
 *
 * try-catch-finaly
 *
 * try-with-resources
 */


public class CopyBytesDemo {
    public static void main(String[] args){
        //Checked ili proveravani tip , ne dopusta da kompajiram kod i da dobijem -> .class
        //konstrukcija koja se zove try with resourcses
        //treba da se koristi kad se cita byte po byte
        try(FileInputStream inputStream = new FileInputStream("data.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            int c;
            while ((c = inputStream.read()) != -1)
            {
                //System.out.println(c + " -> " +((char ) c));
                fileOutputStream.write(c);
            }
        } catch (IOException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
        }
    }
}
