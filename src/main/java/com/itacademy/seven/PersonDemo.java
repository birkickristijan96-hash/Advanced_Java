package com.itacademy.seven;

import com.itacademy.six.Demo.Gender;
import com.itacademy.six.Demo.Person;
import com.itacademy.six.Demo.PersonReader;

/**
 * kad hocu da streamam u javi 8 kazem ovako: pogledati u kod
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Stream;

public class PersonDemo {
    public static void main(String[] args) {

        PersonReader personReader = new PersonReader();
        //Na krjau se sve to ubaci u ovu varijablu person, operator dodijele vrijednosti
        //isto je tako sa streamom, izvor streama je svaka kolekcija
        Person person = new Person() //name null, surname null, gender null, birthday nulll
                .setName("Krisitjan")//name Kristijan, surname null, gender null, birthday nulll
                .setSurname("Birkic")//name Kristijan, Birkic null, gender null, birthday nulll
                .setGender(Gender.MALE)//name Krisitjan, Birkic null, gender MALE, birthday nulll
                .setBirthday(LocalDate.now());//name Kristijan, surname Birkic, gender MALE, birthday 2025-12-23



        List<Person> personList = personReader.readPerson("persons.csv");
        //method chaining :Martin fowler Fluent programming
        personList
                .stream()
                .filter(p -> p.getAge() > 25)
                .map(p -> p.getSurname())
                .forEach(personSurname -> System.out.println(personSurname));


//        Razloziti:
//
//        //Izvor streama
//        Stream<Person> personStream = personList.stream();//svaka kolekcija ima metodu stream
//        //filter nad stream pozvanu i opet smo dobili Stream objekat (modifikovan)
//        Stream<Person> modifiedStream = personStream.filter(p -> p.getGender().equals(Gender.MALE));
//        //Pozvao funkciju filter koja je pozvana nad streamo i kao rezultat je dosla modifikovana
//        Stream<String> stringStream = modifiedStream.map(p -> p.getName() + " " + p.getSurname());
//        //3.terminacija streama
//        personStream.forEach(personName -> System.out.println(personName));
    }
}
