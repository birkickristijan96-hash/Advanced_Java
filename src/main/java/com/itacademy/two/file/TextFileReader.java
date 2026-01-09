package com.itacademy.two.file;

import com.itacademy.two.exception.TextFileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader {


    /**
     * throws -->baci nesto
     * @param filePath
     * @throws TextFileNotFoundException
     */
    //grupa izuzetaka po cijem ce sablonu java kreirati objekte su runtimeexception
    //mozda ovaj file uopce ne postoji
    //filePath - putanja do fajla
    //nece pustit tog nekog na miru dok se ne definira uzrok
    //dio potpisa metode,
    public  void readFile(String filePath ) throws TextFileNotFoundException {
        File file = new File(filePath);
        if(!file.exists()) {
          throw  new TextFileNotFoundException("fajl na putanji '%s' ne postoji ".formatted(filePath));
        }
        System.out.println("pocni citati");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    }
}
