package com.itacademy;

import com.itacademy.one.animal.Bird;

/**
 * ajmo prvo razumijeti sto je to greska
 * exception: error  ->> java excetion
 * unexpected = neocekivani error
 *
 * sustina postojanja klase -- kreiranje varijabli ili objekata po sablonu te klase
 * p1 p2 p3 p4--klasa je ispunila svoju svrhu
 *
 *ko je pozvao konstruktor klase person i zasto
 * p1 = new Person();
 * p2 = new Person();
 *
 *KAD SE KREIRA PO SABLONU KLASE OBJEKAT YNACI DA SE DESILA GRESKA --> ArrayIndexOutOfBoundsException
 *--POZIVA je JRE
 *
 * Tipovi izuzetaka
 *  --RuntimeException -sve greske koje nasljeduju JRE su greske koje nastaju dok se program izvrsava
 *  i pripadaju grupi Runtime
 *
 *  UCHECKED 
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //blok koda je expected -- ocekivas da se sve izvrsi svaka linija koda
        //unexpected ili exception - error koji exceptional event koji  prekida normalan rok izvrsavanje programa
        //izuzetak od normalnog toka izvrsavanja programa - exception handling
        int [] numbers = new int[2];
        numbers[0]=23;
        numbers[1] =24;
        // System.out.println(numbers[2]); //ovaj error je rezultat nase programerske nepaznje
        //iako smo mi kreirali sintakso ispravan program i kompajlirali program
        //u momentu kada smo pokrenuli program on je pao u runtime exception
        System.out.println(numbers[0]);

        //null je referenca ni na sta
        //izuetci su tu da
        Bird bird = new Bird("ptica");
        bird.fly();
        System.out.println(bird);

    }
}
