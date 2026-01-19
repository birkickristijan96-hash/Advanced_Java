package com.itacademy.six.Demo;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Collcetion API
 *      1.Consumer
 *      ---void accept (E element)a
 *      2.Function<T, R>
 *          R apply(T taken),
 *      3.Predicate(koa tester,  vratit ce boolean)
 *          ----Predicate<E> -> tester
 *          bolean test (E element)
 *      4.Supplier(kako dobaavljac)
 *          <E>
 *              E get();
 */
public class PersonDemo {
    public static void main(String[] args) {

        PersonReader personReader = new PersonReader();
       List<Person> personList = personReader.readPerson("persons.csv");
        Function<Person, String> personToName = (Person person)->person.getName();



//       Consumer<Person> personConsumer = person -> System.out.println(person);
//       personList.forEach(personConsumer);
//            personList.forEach(person  -> System.out.println(person));
//            personList.forEach(System.out::println);
//       for (Person person: personList){
//           System.out.println(person);
//       }
    }
}
