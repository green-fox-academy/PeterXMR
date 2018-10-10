public class Shifter implements CharSequence{
 String field;
 int a;
    @Override
    public int length() {
        return  field.length();
    }

    @Override
    public char charAt(int index) {
        return this.field.charAt(index+a);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.field.substring(start+a, end+a);
    }

    public Shifter (String thisWIllBeShifted, int howManyToShift){

        this.field = thisWIllBeShifted;
       this.a=howManyToShift;


    }
}
