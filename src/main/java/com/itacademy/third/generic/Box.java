package com.itacademy.third.generic;

/**
 * ovo F je genericni tip
 * ovo F se moze koristiti kao tip podatka
 * uvesti na nivou cijele klase
 * ne znamo kojeg su tipa nego kad ih parametriziramo
 * e f unbounded -- nemaju nikakvih ogranicenja
 * @param <F>
 */
public class Box<F, E> {
    private F field;
    private E element;

    public F getField() {
        return field;
    }

    public void setField(F field) {
        this.field = field;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
