package com.itacademy.four.io;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

//java.io.FileReader
 class CharacterReader implements Reader{
    @Override
    public String read(String path) throws ReaderException {

        //samo klase koje implemnets Rader bacaju ReaderException
        try (FileReader fileReader = new FileReader(path)){
         StringBuilder stringBuilder = new StringBuilder();
         int c;
         while ((c = fileReader.read()) != -1){
             stringBuilder.append((char) c);
         }
         return stringBuilder.toString();
        } catch (IOException e){
            throw new ReaderException(e.getMessage());
        }
    }
}
