package com.itacademy.third.generic;

import java.time.LocalDate;
/**
 * Tipovid podataka
 *  1. prosti/primitivni
 *  2. slozeni/objektni
 *      --podgrupa:
 *          -> sirove Raw type
 *          -> parametrizirane slozene tipove podataka(genericni tipovi)
 *
 *     Zasto su uvedeni omotaci prostih tipova
 *      odgovor: kako bi se mogli koristiti u parametrizaciji genericnih tipova podataka
 *
 *
 *     Dvije grupe genericnih tipova
 *          --unbounded ->
 *          --bounded ->
 *
 *          Iz Integer u int unboxing i obrnuto Boxing
 */


public class Demo {
    public static void main(String[] args) {
        int number = 23; //tip podatka varijabla = vrijednost
        Integer wrapepr = 23; // Tip_podatka varijabla = vrijednost
        //kreiranjem drugog prostog tipa prekriva se prvi i gubi vrijenods
        //autoboxing autounboxing = omotaci
        Person person = new Person("kristijan", "birkic", LocalDate.now());
        person.setSurname("brkic brkic");


        //boxObjekat je tipa Box ali je parametriziran sa String i Integer(njegova polja su tog tipa)
        Box<String, Integer> boxObjekat = new Box<>();

        //wrapper omotaci
        Box<Double, Integer> numberObjekat = new Box<>();

        NumberBox<Integer> object = new NumberBox<>();
    }
}
