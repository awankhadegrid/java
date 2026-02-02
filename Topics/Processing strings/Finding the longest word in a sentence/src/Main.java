import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String str[]=sentence.split(" ");
        int maxsize=0;
        int index=0;
        for(int i=0;i<str.length;i++){
            int l=str[i].length();
            if(l>maxsize){
                maxsize=l;
                index=i;
            }

        }
        System.out.println(str[index]);
    }
}