package com.itacademy.five;


import com.itacademy.four.io.reader.Reader;
import com.itacademy.four.io.reader.ReaderException;
import com.itacademy.four.io.reader.ReaderFactory;
import com.itacademy.four.io.reader.ReaderType;

/**
 * Razdvoji kreiranje objekata od njihovog koristenja
 *
 * Factory kreira -> trea da poziva konstruktor, varijablu objektnog tipa
 * Consumer-> treba varijablu/objekat ali ne treba da je kreira on vec factory
 *
 */
public class ReaderConsumerDemo {
    public static void main(String[] args) {
// ime enuma. i pristup tom objektu enum
        //ne pozivam objekat nego mu samo pristupam
        Reader lineReader = ReaderFactory.createReader(ReaderType.LINE);
        try {
            String result = lineReader.read("data.txt");
            System.out.println(result);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
