package com.itacademy.five;

import com.itacademy.four.io.writer.Writer;
import com.itacademy.four.io.writer.WriterException;
import com.itacademy.four.io.writer.WriterType;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Objekat se kreira ISKLJUCIVO sa new -> ovo je bilo ranije
 * u javi 8 kada dode do kreiranja objekata TIPA funkcionalnog interfejsa
 * onda je zamjena za new LAMBDA operator (  ->)
 */
public class WriterDemo {
    public static void main(String[] args) {

//        Writer pisac = (putanjaDofajla, sadrzaj) ->{
//          try (FileWriter fileWriter = new FileWriter(putanjaDofajla)){
//              fileWriter.write(sadrzaj);
//          }catch (IOException e){
//              System.err.println(e.getMessage());
//          }
//        };
// Writer pisac2 = (f, c) ->pisesSadrzajKaFajlu(f,c);
//ovdje mi pozivamo Static metodu u lambdi => imeKlase::imeMetoda
// drugi nacin da kreirate objekat
// Writer psiac3 = WriterDemo::pisesSadrzajKaFajlu;
//   CustomFileWriter customFileWriter = new CustomFileWriter();
//     Writer pisac4 = customFileWriter::writeToFile;
//    Writer writer = WriterFactory.createWriter(WriterType.CHAR_WRITER);


       Writer writer = WriterType.BYTE_WRITER.getWriter();
        WriterExecutor writerExecutor = new WriterExecutor(writer);
        writerExecutor.executeWriter("novi fajl.txt", "kiko jos nista ne zna");
    }
//    private static void pisesSadrzajKaFajlu(String filePath, String content){
//        try (FileWriter fileWriter = new FileWriter(filePath)){
//            fileWriter.write(content);
//        }catch (IOException e){
//            System.err.println(e.getMessage());
//        }
//    }
}
