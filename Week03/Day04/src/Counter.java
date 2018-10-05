public class Counter {
    public static void main(String[] args) {
        count(5);
    }
    public static void count (int n) {
        System.out.println(n);

        if (n>=1) {
            count(n-1);

        }
    }
}