package com.itacademy.four.decorator;

public class WhiskeyDecorator extends BeverageDecorator{
    public WhiskeyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name() + " whiskey ";
    }

    @Override
    public double cost() {
        return beverage.cost() + 20.9;
    }
}
