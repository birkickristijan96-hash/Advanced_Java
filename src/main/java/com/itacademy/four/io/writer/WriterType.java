package com.itacademy.four.io.writer;

import javax.swing.*;

public enum WriterType {

    BYTE_WRITER("BYTE", "upisuje u fajl byte po byte ", new ByteWriter()),
    CHAR_WRITER( "CHAR", "upisuje u fajl char po char", new CharacterWriter()),
    LINE_WRITER("LINE", "ovaj pisac buffer cijelu liniju i upise cijelu liniju", new LineWriter()),
    OBJECT_WRITER("OBJECT", "ovaj zapise cijeli objekat odjednom", new ObjectWriter());

    private String name;
    private String description;
    private final Writer writer;

    WriterType(String name, String description, Writer writer) {
        this.name = name;
        this.description = description;
        this.writer=writer;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Writer getWriter() {
        return writer;
    }
}
