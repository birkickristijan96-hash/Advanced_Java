package com.itacademy.four.decorator;
//relacije medu klasama
    //1.nasljedivanje
    //2.kompozicija
public abstract class BeverageDecorator implements Beverage {


    //Depend upon abstraction not upon concrete impleentation
    //protected final Tea tea;
    protected final Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
}
