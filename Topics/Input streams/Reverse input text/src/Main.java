import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> cha=new ArrayList<>();
        int ch;
        while ((ch=reader.read())!=-1){
            cha.add((char)ch);
        }
        Collections.reverse(cha);
        for(int n:cha){
            System.out.print((char) n);
        }
        reader.close();
    }
}