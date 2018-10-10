public class Gnirts implements CharSequence {
    String field;
    @Override
    public int length() {
        return this.field.length() ;
    }

    @Override
    public char charAt(int index) {
        return this.field.charAt(field.length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public Gnirts(String a) {
        this.field = a;
        System.out.println(this.field);
    }


}
