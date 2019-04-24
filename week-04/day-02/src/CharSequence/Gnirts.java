package CharSequence;

public class Gnirts implements CharSequence{
    String gnirts;

    Gnirts(String gnirts) {
        this.gnirts = gnirts;
    }

    @Override
    public int length() {
        return gnirts.length();
    }

    @Override
     public char charAt(int index) {
         return gnirts.charAt(length()-index-1);
     }

     @Override
    public CharSequence subSequence(int start, int end) {
          return null;
    }
}
