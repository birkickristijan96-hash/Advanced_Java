package com.itacademy.four.io.reader;

/**
 * Checked --
 * Unchecked -->
 *try with resource kad radimmo samo sa closeable
 * throw new Reader
 */
public class ReaderException extends Exception {

    public ReaderException(String message){
        super("READER:  %s".formatted(message));
    }
}
