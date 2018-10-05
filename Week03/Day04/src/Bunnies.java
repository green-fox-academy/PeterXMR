public class Bunnies {
    public static void main (String [] args) {
        System.out.println(numOfEars(4));
    }
    public static int numOfEars(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return 2+numOfEars(n - 1);
        }
    }
}
