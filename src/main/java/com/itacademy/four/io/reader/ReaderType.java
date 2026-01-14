package com.itacademy.four.io.reader;

/**
 * kada zelimo ograniciti koliko objekata onda kreiramo enum ili numerirani type
 * svi objekti su ununtar enuma
 *
 * imamo 4 tipa readera, ne zelimo da kreiramo 100 komada tipova itd... enum ogranicava
 * enum ima sve sto klasa mora imati, svojstveno je sto je kostruktor enuma privatan tj mora biti private
 *
 */
public enum ReaderType {
    //konvencija je da ovo bude upper case
    CHAR("byte", "cita byte po byte"),
    LINE("lINE", "CITA LINE BY LINE"),
    OBJECT("OBJECT", "BLA BLA BLA"),
    BYTE("BYTE", "cita byte po byte")
    ;

//KONSTRUKTOR ENUM MORA BITI RPIVATE NE MOZE BITI PUBLIC MOOORRA
    // kao posljedica toga konstruktor moze biti pozvan samo iz defincije enuma
    // prevedeno
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
