public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        int b = 13;
        // if a is even increment out by one
        if (a >= 1) {
            System.out.println(out);
        } else if (b > 10 && b < 20) {
            String out2 = "Sweet";
        } else if (b < 10) {
            System.out.println("Less!");
        } else if (b > 20) {
            System.out.println("More!");
        }
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"


        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same

        if (credits >= 50 && isBonus == false) {
            c = c - 2;
        }

        if (credits < 50 && isBonus == false) {
            c = c - 1;
        } else if (isBonus == true) {
            c = c;
        }
        System.out.println(c);


        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"
        if (d % 4 == 0 && d < 200) {
            out3 = "check";
        } else if (time > 200) {
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
            System.out.println(out3);
        }
    }
}