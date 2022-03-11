package com.company;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {
            PrintWriter writer = new PrintWriter("C:\\\\Users\\\\aleks\\\\Desktop\\\\File.txt");
            for (int i = 0; i < 10; i++) {
                writer.write(i + "\n");
            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                strings.add(Integer.toString(i));
            }
            Files.write(Paths.get("C:\\\\Users\\\\aleks\\\\Desktop\\\\File.txt"), strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
