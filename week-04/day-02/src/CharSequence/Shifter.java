package CharSequence;

public class Shifter implements CharSequence {
    String string;
    int shift;

    public Shifter(String string, int shift) {
        this.shift = shift;
        this.string = string;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {

        if(index > shift) {
            return string.charAt (index);
        } else {
            return string.charAt(shift - index);
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
