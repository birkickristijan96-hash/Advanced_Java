package com.itacademy.five;

import com.itacademy.four.io.writer.Writer;
import com.itacademy.four.io.writer.WriterException;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.PrimitiveIterator;

/**
 * Relacija izmedu klase WriterExectuion i Writer = KOMPOZICIJA
 * Kad imamo relaciju kompozicije pravimo slabu vezu
 */
public class WriterExecutor {
// ne vezemo se za byte writera,
    //pravi slabu ili jaku vezu
    // slaba veza -> private Writer writer
    //jaka veza -> private ByteWriter -> problem jake veze je sto se zakucamo samo na byte u ovom slucaju
    //moga bi samo njega konzumirati -> tijesna veza
    private Writer writer;

    public WriterExecutor(Writer writer) {
        this.writer = writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void executeWriter(String path, String content){
        try {
            writer.write(path, content);
            } catch (WriterException e){
            System.err.println(e.getMessage());
             }
        }
}
