package com.itacademy.four.io;

/**
 * ideja je da ovdje ne pozivamo konstruktor i ne konstruiramo objekte
 * ovdje ih samo konzumiramo a Factory ce ih za nas kreirati
 *
 */
public class ConsumerDemo {
    public static void main(String[] args) {



        //Dvije stvari smetaju:
        //1.ReadFactory.createReader("Charmogupogrijesiti")
        //2.nisam forsirao princip razdvoji kreiranje objekata od njihovog koristenja
        // --popravljeno,,staviti u paketno-private - vidljive samo unutar paketa
        Reader reader = ReaderFactory.createReader(ReaderType.LINE);
        try {
            String fileContent = reader.read("data.txt");
            System.out.println(fileContent);
        }catch (ReaderException readerException){
            System.err.println(readerException.getMessage());
        }
    }
}
