package com.company;
public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal" , "pand", "zebr"};
        String [] another = {"a"};

        for (int i = 0; i < animals.length; i++)
            animals[i] = String.format("<%s>%s</%1$s>", animals[i], animals[i]);

        String result = "";
        for (String str : animals)
            result += str;

        System.out.println(result);
        }


        }
        ;

            // - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
