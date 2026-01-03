package com.itacademy.one.animal;

import com.itacademy.one.beverage.Flyable;

public class Bird extends  Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        super.playSound();
    }

    @Override
    public void fly() {
        System.out.println(" i am bird and i am flying");
    }
}
