package com.itacademy.seven;

import com.itacademy.four.io.writer.Writer;
import com.itacademy.four.io.writer.WriterType;
import com.itacademy.six.Demo.Gender;
import com.itacademy.six.Demo.Person;
import com.itacademy.six.Demo.PersonReader;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
 *
 *               LAMBDA KREIRA OBJEKTE SAMO FUNKCIONALNOG INTERFACEA,A OVO GORE SU NAVEDENA
 *               4 FUNKCIONALNA INTERFACE KOJIMA MOZEMO RIJESIT SKORO SVE PROBLEME NASEG ZIIIIVOTAA
 *               U PROGRAMIRANJU
 */

public class Demo {
    public static void main(String[] args) {

        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPerson("persons.csv");
        //printPersons(personList);
        //genericPrintPersons(personList, person -> true);

        //ovdje je definicija testiranja
        //genericPrintPersons(personList, person -> person.getAge()<40);
       // genericPrintPersons(personList, person -> person.getAge()<24);
//        Predicate<Person> personPredicate = person -> person.getAge()>=30 && person.getAge()<=40;
//        genericPrintPersons(personList, personPredicate);
//        Predicate<Person> tester = person -> person.getAge() > 45;
//        tester.test(new Person());
        //bolji nacin poredenja je ovako

        Writer writer = WriterType.BYTE_WRITER.getWriter();
        //accept =>output void;   input: Person persona
        //testirati objekat
        //tester
        Predicate <Person> tester = person -> Gender.FEMALE.equals(person.getGender());
        //Transformacija Person -> String
        //transformer
        Function<Person, String> personTransformer = person -> person.getName() + " " + person.getSurname();
        //consumer
        Consumer<String> consumer = personText -> System.out.println(personText); //ovaj blok koda poziva accpet
               // procesPersonList(personList, tester, personTransformer, consumer);

        /**
         * prije java 8 smo iterirali a sada streamamo kroz kolekciju
         *
         */

        personList
                //strimamo kroz kolekciju
                .stream()
                //filtriramo, samo oni koji su prosli test ostaju
                .filter(tester)//Stream<Person>
                //ulaz u map bude stream od Person a izlaz stream od stringova
                .map(personTransformer)
                //definira nacin na koji ce oni biti konzumirani
                .forEach(consumer);
    }

    /**
     *  1.Person p -> testiram Predicate test metodu
     *  2. Person p -> transformaciju String -> Function<Person. String>
     *  2.String  -> acceptam ili konzumiram kroz metodu accept, Consumer accpet
     *
     * @param personCollection
     * @param personTester
     * @param personConsumer
     */
        //List vs set
        //1. lista dozvoljava duplikate set ne
        //2. lista pamti redoslijed, set ima neki svoj koji nije nas
        //3.lista podrzava indeksiran pristup set ne podrzava indeksiran pristup
        // lista je najslicnija sa nizovima, liste su nesto sto je najcesce koristeno u kolekcijama
//        private static void procesPersonList(Collection<Person>personCollection,
//                                             Predicate < Person > personTester,
//                                             Function<Person, String> personTransform,
//                                             Consumer<Person> personConsumer){
//        //iteriramo kroz kolekciju
//            for (Person person : personCollection) {
//                //definira nacin na koji ce biti procesiran jedan person element,
//                // testira person varijablu u kolekciji
//                if (personTester.test(person)) ;
//                //2.transformacija Perosn -> String
//                String personText = personTransform.apply(person);
//                //konzumiramo person String represent
//              personConsumer.accept(personText); //tu se pozivaaaaa
//                //ovdje je poziv te definicije
//            }
//        }
    }


//        for (int i=0; i < personList.size(); i++){
//            Person person = personList.get(i);
//            System.out.println(person);
//        }
//    }