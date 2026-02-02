import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            ans=ans+a+str.charAt(i);
        }
        System.out.println(ans);
    }
}