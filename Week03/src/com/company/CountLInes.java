package com.company;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.util.Scanner;

public class CountLInes {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of file" +".txt");
        String fileName = input.next();
        String line = input.nextLine();

        try {
            FileReader fr = new FileReader(String.valueOf(fileName));
            LineNumberReader ln = new LineNumberReader(fr);
        }
        catch (Exception e){
            System.out.println("0");
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
        }
    }
}
