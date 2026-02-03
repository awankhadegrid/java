import java.io.CharArrayWriter;
import java.io.IOException;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method
        CharArrayWriter ch=new CharArrayWriter();
        for(String a:words){
            ch.write(a);
        }
        return ch.toCharArray();
    }
}