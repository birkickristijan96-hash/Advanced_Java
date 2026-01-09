package com.itacademy.four.io;

/**
 * throws je samo deklaracija u potpisu metode
 *
 */
public interface Reader {
    String read(String path) throws ReaderException;
}
