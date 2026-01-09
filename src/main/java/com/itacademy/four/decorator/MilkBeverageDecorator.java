package com.itacademy.four.decorator;

/**
 * public / svima dostupno
 * private / vidi samo klasa gdje je polje /fielda deklarisano
 * package private: bez keyword i vidi samo klasa gdje je polje deklarisano and klase u istom paketu
 * rotected : ekstenzija paketno privatne vidljivosti: isti ko i package private, ali vide i klase koje su u istom
 * paketu i klase koje mozda nisu u istom paketu ali extendaju klase npr BeverageDecorator
 */

public class MilkBeverageDecorator extends BeverageDecorator {


    public MilkBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name() + " s mlijekom ";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
