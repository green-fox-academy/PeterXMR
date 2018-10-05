public class NumberAdder {
    public static void main(String[] args) {
        //  n and adds numbers from 1 to n.
        System.out.println(addTo1(5));
    }

    public static int addTo1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + addTo1(n-1);
        }
    }
}