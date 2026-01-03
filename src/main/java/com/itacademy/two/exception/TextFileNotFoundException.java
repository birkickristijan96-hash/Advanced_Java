package com.itacademy.two.exception;

import java.io.FileNotFoundException;

/**
 * Checked - provjeravani izuzetci
 *
 * po sablonu klasa koje nasljeduju runtime exception ja ne kreiram objekte
 *
 * po sablonu klasa koje nasljedeuju exception ja mogu dizajnirati i vlastiti tip greske
 *
 * final finalna -- ne moze se naslijediti final klasa
 */
public final class  TextFileNotFoundException extends FileNotFoundException {

    public TextFileNotFoundException(String message){
        super("text: %S".formatted(message));
        System.out.println("nedostaje tekstualni fajl");
        System.out.println("program zavrsio");
    }
}
