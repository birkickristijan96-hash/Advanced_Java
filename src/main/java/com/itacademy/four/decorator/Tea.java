package com.itacademy.four.decorator;

public class Tea implements Beverage{
    @Override
    public String name() {
        return "caj";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
