public class PrintParams {
    public static void main (String[]args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        printParams(a,b,c,d);
        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ..
    }
    public static void  printParams (int a, int b, int c, int d){
        String an = String.valueOf((a+", "+b +", "+c +", "+d));
        System.out.println(an);
    }
}
