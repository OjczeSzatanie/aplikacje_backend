package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("Hello");

        File file = new File("file.txt");
        int length = (int) file.length();
        InputStreamReader reader = null;
        FileInputStream stream = null;
        try {// try-with-resources == using()
            stream = new FileInputStream(file);
            reader = new InputStreamReader(stream, StandardCharsets.UTF_8);

            char[] data = new char[length];
            int readBytes = reader.read(data, 0, length);
            if (readBytes != length) {
                throw new IOException("File reading error.");
            }

            String text = new String(data);
            System.out.println(text);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            stream.close();
        }

    };
}
