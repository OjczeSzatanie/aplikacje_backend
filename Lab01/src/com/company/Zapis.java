package com.company;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Zapis {

    public static void main(String[] args) throws IOException {

        String text = "updated text";
        try (
                FileOutputStream stream = new FileOutputStream("file.txt");
                OutputStreamWriter writer = new OutputStreamWriter(stream, StandardCharsets.UTF_8);
        ) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    };
}
