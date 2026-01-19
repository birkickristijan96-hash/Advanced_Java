package com.itacademy.six.Demo;

import com.itacademy.four.io.reader.Reader;
import com.itacademy.four.io.reader.ReaderException;
import com.itacademy.four.io.reader.ReaderFactory;
import com.itacademy.four.io.reader.ReaderType;

import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonReader {

    public List<Person> readPerson(String personFilePath){
        List<Person> personList = new ArrayList<>();
        Reader reader = ReaderFactory.createReader(ReaderType.LINE);
        try {
            String allPeersonsContent = reader.read(personFilePath);
            String lineSeparator = System.lineSeparator();
            String[] personContent = allPeersonsContent.split(lineSeparator);
            for (String personaContent: personContent){
                //Kristijan;Birkid;M;1996-11-22
                String[] personFields = personaContent.split(";");
                Person person = new Person();
                person.setName(personFields[0]);
                person.setSurname(personFields[1]);
                String description = personFields[2];
                Gender spol = Gender.fromDescription(description);
                person.setGender(spol);
                String date = personFields[3];
                String[] dateParts = date.split("-");
                int year = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int day = Integer.parseInt(dateParts[2]);
                LocalDate birthday = LocalDate.of(year, month,day);
                person.setBirthday(birthday);
                personList.add(person);
            }
            System.out.println(allPeersonsContent);
        }catch (ReaderException e){
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
        return personList;
    }
}
