public class BunniesAgain {
    public static void main(String[] args) {
        System.out.println(bunniesEars(10));
    }

    public static int bunniesEars(int n) {


        if (n <= 0) {
            return 0;
        }
        else if (n % 2 != 0){
            return 2 + bunniesEars(n - 1);
        }
        else {
            return 3+bunniesEars(n -1);
            }
        }
    }

