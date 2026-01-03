package com.itacademy.one;

import com.itacademy.one.beverage.Flyable;

/**
 * dependency - zavisnost flySimulatora postoji samo Flyable
 * ovisan samo o interfaceu
 *
 * ne zna da postoji jer je napravljena ovisnost od interfacea
 */
public class FlySimulator {
    // depend upon aabstraction(abstract class/interface)not upon concrete implementation
    // kompozicija = zavisnost, zavisim od  flyble objekta
    //od zavisnosti ne mozemo pobjeci
    private Flyable flyable;

    public FlySimulator(Flyable flyable){
        this.flyable=flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
        public void simulateFlying(){
        this.flyable.fly();
        }
}
