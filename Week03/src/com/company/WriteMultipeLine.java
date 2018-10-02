package com.company;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipeLine {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            char userCharacter;
            System.out.println("Enter Path:");
            Scanner sc1 = new Scanner(System.in);
            String fw = sc1.nextLine();

            System.out.println("Enter Word:");
            Scanner sc2 = new Scanner(System.in);
            String text = sc2.nextLine();

            System.out.println("Enter Number");
            Scanner sc3 = new Scanner(System.in);
            String number = sc3.nextLine();

            PrintWriter worlds = new PrintWriter(fw);
            worlds.println(text);
            worlds.close();
            int nOfChar = text.charAt(0);


        } catch (Exception next) {
            System.out.println("Everything gonna be allright.");

        }

    }
        public static void lineWriter (String sc2, int nOfChar){

            List<String> newlist = new ArrayList<>();
            for (int i = 0; i < nOfChar ; i++) {
                newlist.add(sc2);
            }

    }

    // Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
}