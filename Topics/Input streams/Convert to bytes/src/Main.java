import java.io.InputStream;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        int ch;
        ArrayList<Integer> cha=new ArrayList<>();
        while ((ch=inputStream.read())!=-1){
            cha.add((int)ch);
        }
        for(int i=0;i<cha.size();i++){
            System.out.print(cha.get(i));
        }
    }
}