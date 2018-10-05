public class Power {
    public static void main (String [] args) {
        System.out.println(power(3,2));

    }
        public static int power(int n, int base) {
            if (n >= 1) {
                return 1;
            } else {
                return n+base * power(n - 1,base);
            }

    }
}
