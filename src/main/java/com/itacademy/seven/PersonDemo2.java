package com.itacademy.seven;

import com.itacademy.six.Demo.Person;
import com.itacademy.six.Demo.PersonReader;

import java.util.ArrayList;
import java.util.List;

/**
 * LAMBDA koristimo kada kreiramo objekte tipa funkcionalnog interfacea
 * consumer
 * predicate
 * function
 * -> kao shortcut za operator new
 *
 */

public class PersonDemo2 {
    public static void main(String[] args) {

        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPerson("persons.csv");
        personList
                .stream()
                .filter(p->p.getAge()>30)
                .map(p->p.getSurname() + " | " +p.getName()+ " | " + p.getAge())
                .forEach(personName-> System.out.println(personName));

    }
}
