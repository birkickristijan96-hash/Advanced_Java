package com.itacademy.four.io.reader;

/**
 * throws je samo deklaracija u potpisu metode
 * ovaj Reader interface ima samo jednu abstract metodu
 * svojstveno interfejsima jest da su svi, potpisi metoda koje nemaju svoj blok koda
 *po automatizmu potpisi ABSTRACT METHODS\
 *
 * public abstract -> podrazumijeva
 *      --pozeljno izostaviti ali nije pogresno
 */
public interface Reader {
    String read(String path) throws ReaderException;
}
