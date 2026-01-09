package com.itacademy.four.decorator;

public class Kafana {
    public static void main(String[] args) {

        //caffe : Beverage, Caffe
            Caffe caffe = new Caffe();
            consume(caffe);
            //tea> Tea, Beverage
            Tea tea = new Tea();
            consume(tea);

            Beverage beverage = new MilkBeverageDecorator(new Caffe());
            consume(beverage);

            Beverage beverage1 = new WhiskeyDecorator(new Tea());
            consume(beverage1);

            Beverage beverage2 = new WhiskeyDecorator(new Caffe());
            consume(beverage2);

    }

    static void consume(Beverage beverage){
        System.out.println(beverage.name()+ " kosta " + beverage.cost());
    }

}
