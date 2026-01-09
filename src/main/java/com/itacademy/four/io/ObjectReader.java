package com.itacademy.four.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Person persona = new Person();
 *
 * java.io.FileInputStream -> byte byte -> byte series
 * java.io.ObjectInputStream
 */
 class ObjectReader implements Reader{
    @Override
    public String read(String path) throws ReaderException {
       try(ObjectInputStream ob = new ObjectInputStream(new FileInputStream(path));){
            Object readObject = ob.readObject();
            return readObject.toString();
    }catch (Exception e){
           throw new ReaderException(e.getMessage());
       }
    }
}
