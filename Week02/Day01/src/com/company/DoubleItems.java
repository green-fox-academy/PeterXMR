package com.company;

public class DoubleItems {
        public static void main(String[] args) {
            // - Create an array variable named `numList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
            int numList[] = {3, 4, 5, 6, 7};

            for (int x : numList) {
                x = doubleX(x);
                System.out.println(x);
            }

        }
        public static int doubleX(int n){
            return  n+n;
        }
}
