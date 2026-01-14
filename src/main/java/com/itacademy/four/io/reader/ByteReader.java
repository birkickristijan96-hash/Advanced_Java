package com.itacademy.four.io.reader;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *ByteReader obj = new ByteRader();
 * obj.read();
 * java.io.FileInputStream --> citanje fajlova
 * try -> koji se izvrsava kada je sve bez greske
 */
    class ByteReader implements Reader {
    @Override
    public String read(String path) throws ReaderException {
        //1. da definiras blok koda koji e se izvrsiti kada je sve bez greske (FileNotFoundException)
        //2. da definiras blok koda koji ce se izvrsaati kad dode do greske FileNotFoundException
        // Ako zelimo dodatno izbjeci curenje memorije onda treba neko nekad pozvati fis.close
        try (FileInputStream fis = new FileInputStream(path);){
            StringBuilder stringBuilder = new StringBuilder();
            int b;
            while ((b = fis.read()) != -1){
                stringBuilder.append((char) b);
            }
            return "";
        }catch (IOException exc){
            throw new ReaderException(exc.getMessage());
        }
    }
}
