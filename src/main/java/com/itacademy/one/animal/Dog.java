package com.itacademy.one.animal;
//klasa inherit klasu => extends
// interface inherit interface --> extends
//klasa inherit interface -- implements



public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        super.playSound();
    }
}
