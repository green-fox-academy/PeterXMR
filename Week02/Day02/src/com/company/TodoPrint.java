package com.company;

public class TodoPrint {
            public static void main(String... args){
                String todoText = " - Buy milk\n";
                // Add "My todo:" to the beginning of the todoText
                // Add " - Download games" to the end of the todoText
                // Add " - Diablo" to the end of the todoText but with indention
                System.out.println(todoText.startsWith("My todo:"));
                System.out.println(todoText.endsWith(" - Download games"));


                // Expected outpt:

                // My todo:
                //  - Buy milk
                //  - Download games
                //      - Diablo

            }
        }