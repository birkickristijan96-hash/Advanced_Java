package com.itacademy.four.decorator;

public class Caffe implements Beverage{
    @Override
    public String name() {
        return "kafa";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
