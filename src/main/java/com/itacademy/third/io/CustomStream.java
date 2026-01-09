package com.itacademy.third.io;

import java.io.Closeable;
import java.io.IOException;

public class CustomStream implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("netko je pozvao metodu close");
    }
}
