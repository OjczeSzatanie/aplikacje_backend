package com.company;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class readbytes {
    public static void main(String[] args) throws IOException {
        byte[] data;

        try {
            data = Files.readAllBytes(Paths.get("file.txt"));

        } catch (IOException e){
            throw e;
        }
        String text = new String(data, StandardCharsets.UTF_8);
    };
}
