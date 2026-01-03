package com.itacademy.one;

import com.itacademy.one.animal.Bird;
import com.itacademy.one.beverage.Helicopter;
import com.itacademy.one.beverage.Plane;


/**
 * tijesna veza = losa veza
 *KOMPOZICIJA  je zavisnot od apstraktne klase = slaba veza (dobro)
 *
 * interface segregation princip
 * ne tjeraj klasu da implementira metodu koju ne koristi
 * bolje imati vise apstrakcija/interface nego jedan sa mnogo apstraktnih metoda
 */

public class Demo {
    public static void main(String[] args) {

        //bird: tipa Bird Animal Flyable
        //mozemo reci da je bird visetipna varijabla
        Bird bird = new Bird("papagaj");
        Plane plane = new Plane();
        Helicopter helicopter = new Helicopter();

        //Strategy pattern
        FlySimulator flySimulator = new FlySimulator(bird);
        flySimulator.simulateFlying();
        flySimulator.setFlyable(plane);
        flySimulator.simulateFlying();
        flySimulator.setFlyable(helicopter);
        flySimulator.simulateFlying();
    }
}
