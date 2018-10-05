
public class String1 {
    public static void main (String []args){

        String lkok = "boxxing";
        System.out.println("");
        ofYs(lkok,"xxx");
    }

    public static String ofYs(String ofXs, String strYs) {
        System.out.println(ofXs);
        System.out.println(strYs);
        if (ofXs.endsWith("y")) {
            return ofXs;
        } else if (ofXs.charAt(0) == ('x')) {
            System.out.println(strYs);
            return strYs;
        } else {
            return ofXs;
        }

    }

}
