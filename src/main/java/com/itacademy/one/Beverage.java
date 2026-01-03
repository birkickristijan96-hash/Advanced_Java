package com.itacademy.one;

/**
 * functional interface
 *
 * oop
 *  enkapsulacija
 *  abstract
 *  extends
 *  polimorfizam
 *
 *
 *  SOLID
 *      single responsibility
 *          open close
 *          liskov substitution
 *         interface segregation -> ne tjeraj klasu da implemnetira metode koje ne koristi
 *              nemoj imati jedna debeli interface
 *          dependency inversion
 */
public abstract class Beverage {
    private String name;

    public Beverage(String name){
        this.name = name;
    }

    public abstract double cost();

    public String getName() {
        return name;
    }
}
