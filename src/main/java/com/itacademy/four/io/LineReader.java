package com.itacademy.four.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * DECORATOR
 *
 * BufferedReader -> charactere iz jedne linije. Pomocu FileReader ce iscitati karaktere i
 * kad dode /n /r /n String line pa prelazi u sljedecu liniju
 *Caffe
 *
 * Milk
 *
 * new MilkDecorator(new Caffe());
 * nw BufferedReader(new FileReader());
 *
 * Decorator design sablon
 */
 class LineReader implements Reader{
    @Override
    public String read(String path) throws ReaderException {
        try {
            StringBuilder sb = new StringBuilder();
            //fileReader : tipa je FileReader, InputStreamReader, Reader
//            FileReader fileReader = new FileReader(path);
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null){
            // \n\r windows
            String lineSeparator = System.lineSeparator();
            sb.append(line).append(lineSeparator);
        }
        return sb.toString();
    }catch (Exception e){
            throw new ReaderException(e.getMessage());
        }
    }
}
