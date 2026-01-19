package com.itacademy.seven;

import com.itacademy.six.Demo.Person;
import com.itacademy.six.Demo.PersonReader;

import java.util.Collection;
import java.util.List;

/**
 * Lambda sa kolekcijom odlicno
 *
 * Funkcionalni interfejs:
 *  potreban i dovovljan uslov da interfejs bude funkcionalni jeste da ima jednu i samo jednu
 *  apstraktnu metodu
 *
 *
 *  LAMBDA -> : moze se koristit kao shortcut za kreirane objekata TIPA funkcionalnog interfejsa
 *  ->{}
 *
 *  Sto je apstraktna metoda?
 *          -nema blok koda
 *          -rezultat - ima - u potpisu kaze kojeg je tipa njen rezultat
 *          -input params 0 ili n
 *  Sto je metoda ili fukncija
 *      -blok koda koji se izvsava kada ga neko pozove metodu
 *      -najcesce ima rezultat koji moze biti void(praznina) ili nekog tipa rezultat, int float Person, ListtPersons
 *      -input params : --> nemojte ici na veci broj params od tri
 *
 *
 *      MAIN metoda
 *      main metoda kada pakujete program u JAR a moze biti i .exe
 *      moze postojati samo jedna main metoda
 *      pokrece je onaj koji starta program
 *
 *
 *      Spomenuto: -> 4 najvaznija interface u javi sa kojima mozemo napraviti gotovo sve
 *      a uz njih se nalaze i njihovi potpisi
 *          -1. supplier<E>
 *              E get(); -> potpis njegove metode
 *           2. Consumer <E>
 *               void accept (E element); - on samo prihvata element kao input
 *           3.Predicate<E> kao tester element
 *              vrati boolean test (E element)
 *
 *           4. Function <T, R>
 *               R apply(T takenParam); -> uzme taj T napravi neto sanjim i pretvori ga u R
 *               (Transformira ili transformer interface)
 */

public class Demo {
    public static void main(String[] args) {

        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPerson("persons.csv");
        printPersons(personList);

    }

    //List vs set
    //1. lista dozvoljava duplikate set ne
    //2. lista pamti redoslijed, set ima neki svoj koji nije nas
    //3.lista podrzava indeksiran pristup set ne podrzava indeksiran pristup
    // lista je najslicnija sa nizovima, liste su nesto sto je najcesce koristeno u kolekcijama
    private static void printPersons(Collection<Person> personCollection) {
        for (Person person: personCollection){
            System.out.println(person);
        }
    }

//        for (int i=0; i < personList.size(); i++){
//            Person person = personList.get(i);
//            System.out.println(person);
//        }
    }