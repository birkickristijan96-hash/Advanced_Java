package com.itacademy.five;

import com.itacademy.four.io.reader.Reader;
import com.itacademy.four.io.reader.ReaderFactory;
import com.itacademy.four.io.reader.ReaderType;
import com.itacademy.four.io.writer.ObjectWriter;
import com.itacademy.four.io.writer.WriterException;
import com.itacademy.third.generic.Person;

import java.time.LocalDate;

public class ObjectReadWriteDemo {
    public static void main(String[] args) {

        Person person = new Person("kristijan", "birkic", LocalDate.now());
        ObjectWriter objectWriter = new ObjectWriter();
        try {
            objectWriter.write("persoa.ser", person);

        }catch (WriterException e){
            System.err.println(e.getMessage());
        }

        Reader objectReader = ReaderFactory.createReader(ReaderType.OBJECT);
    }
}
