package com.itacademy.four.io.writer;

/**
 * potreban i dovoljan  uslov da interfae bude funkcionalni je:
 *  samo jednu apstraktnu metodu -> jednu i samo jednu
 */
@FunctionalInterface
public interface Writer {
//static vs non-static(instancna metoda)
    void write (String path, String content) throws WriterException;
    //preduvjet da postoji objekatWriter.print();
    default void print(){
        System.out.println("ispis");
    }

}
