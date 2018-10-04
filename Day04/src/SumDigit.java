public class SumDigit {
    public static void main(String[] args) {
        System.out.println(nonNegative(3));
    }

    public static int nonNegative(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + nonNegative(n-1);
        }
    }
}