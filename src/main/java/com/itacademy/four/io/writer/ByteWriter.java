package com.itacademy.four.io.writer;
//FileOutputStream -> byte po byte saljemo sadzaj -> content u faj -> path

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * instancnu metodu mogu pozvati samo kad postoji objekat
 *  * Writer writer = new Writer() // ne moze
 */

 class ByteWriter implements Writer{

    @Override
    public void write(String path, String content) throws WriterException {
        //kada pozovem neku metodu ili konstruktor koja u svom potpisu ima throws CheckedException
        //ako je closable onda ide unutar try with resource tj zatvoriti ga a to su (ove) yagrade
        try(FileOutputStream fileOutputStream = new FileOutputStream(path);){
            byte [] charArray = content.getBytes();
            fileOutputStream.write(charArray);
        }
         catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
