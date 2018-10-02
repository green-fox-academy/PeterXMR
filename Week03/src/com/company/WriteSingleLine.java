package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        try { Path filePath = Paths.get("my-file.txt");
            FileWriter fw = new FileWriter("my-file.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Peter");
            pw.close();
        }
        catch (Exception e) {
            System.out.println("Unable to wirte file: my-file.txt");

        }
    }
}

