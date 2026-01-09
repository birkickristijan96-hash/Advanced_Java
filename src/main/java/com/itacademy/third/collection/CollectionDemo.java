package com.itacademy.third.collection;


import com.itacademy.third.generic.NumberBox;
import com.itacademy.third.generic.Person;

import java.util.*;

/**
 * OOP - inheritance polymorfizam, nterface, abstract, enkapsulacija
 *  generic
 *
 *  Nizovi imaju dva ogranicenja -> svi moraju biti istog tipa unutar niza
 *                              -> fiksna duzina
 *
 *                              list -> pamti, prima duple elemente, indekiran pristup
 *                              set -> sve obrnuto
 *
 */
public class CollectionDemo {
    public static void main(String[] args) {

        int[] number = new int[3];

        //nameCollection -> Hashset Set Collection, poli,orfistican -> visetipan
        Collection<String> nameCollectiona = new HashSet<>();

        //listOfNames - > ArrayList,List, SequencedCollection Collection, Iterable
        //visetipna lista-> moras implementirati iterator, moras biti kolekcija, kolekcija koja moze na pocetak ili na kraj,
        // lista je rekla pamti
        //arraylista je samo to implementirala
        List<String> listOfNmaes = new ArrayList<>();
        listOfNmaes.add("kristijan");
        listOfNmaes.add("birkic");
        listOfNmaes.add("kiko");
        listOfNmaes.add("kiko");
        // i u list postoji add
//        for (int i=0; i<listOfNmaes.size(); i++){
//            String element = listOfNmaes.get(i);
//            System.out.println(element);
//        }
        printCollection(listOfNmaes);

        //Enhanced foor loop prima objekat tipa iterable, napredna for petlja
//        CustomCollection collection = new CustomCollection();
//        for (Person el : collection){
//
//        }

        System.out.println();

        //setNames = tipa je Set HashSet, Collection, Iterable
        Set<String> setNames = new HashSet<>();
        setNames.add("kristijan");
        setNames.add("birkic");
        setNames.add("elmir");
        setNames.add("elmir");


        //ENHANCED FOR LOOP
//        for (String element : setNames){
//            System.out.println(element);
//        }
        printCollection(setNames);
        System.out.println();

        Set<String> setNames2 = new LinkedHashSet<>();
        setNames2.add("kristijan");
        setNames2.add("birkic");
        setNames2.add("elmir");
        setNames2.add("elmir");

        printCollection(setNames2);
        System.out.println();

        //kod TreeSet obavezno je ada abecedno poslozi rezultat u slucaju stringova, komparira
        //jedini koji pamt redoslijed LinkedHashSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("kristijan");
        treeSet.add("birkic");
        treeSet.add("elmir");
        treeSet.add("elmir");

        printCollection(treeSet);

    }

    //u setovima nema indeksiranog pristupa
    //nema uklanjanja elementa na nekom indeksu, ne mozemo indeksirano saznati gdje je koji elemnt
    //HashSet u setovima postoji add

    static void printCollection(Iterable<String> stringCollection){
        for (String element : stringCollection){
            System.out.println(element);
        }
    }
}
