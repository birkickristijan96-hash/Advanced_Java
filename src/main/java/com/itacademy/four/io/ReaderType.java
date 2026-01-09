package com.itacademy.four.io;

/**
 * kada zelimo ograniciti koliko objekata onda kreiramo enum ili numerirani type
 * svi objekti su ununtar enuma
 */
public enum ReaderType {
    CHAR("byte", "cita byte po byte"),
    LINE("lINE", "CITA LINE BY LINE"),
    OBJECT("OBJECT", "BLA BLA BLA"),
    BYTE("BYTE", "cita byte po byte")
    ;

//KONSTRUKTOR ENUM MORA BITI RPIVATE NE MOZE BITI PUBLIC MOOORRA
    private String name;
    private String description;

    private ReaderType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
