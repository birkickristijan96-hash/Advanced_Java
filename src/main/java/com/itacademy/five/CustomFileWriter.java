package com.itacademy.five;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {


    //preduvjet da pozovemo non-static method je da moramo imati objekat ali kakav
    //objekat ovog tipa
    //CustoFile customFile = new.....
    //c.writeToFile
    public void writeToFile(String path, String content ){
        try (FileWriter fileWriter = new FileWriter(path)){
            fileWriter.write(content);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
