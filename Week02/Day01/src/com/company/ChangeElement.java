package com.company;

public class ChangeElement {
    public static void main(String[] args) {

        // - Create an array variable named `s`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element
        int myList[] = {1, 2, 3, 8, 5, 6};
        myList[3] = 4;

        System.out.println(myList[3]);

    }
}