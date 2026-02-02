import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        String main1=str1.replace(" ","");

        String main=str2.replace(" ","");
        boolean ans=false;
        if(main1.equals(main)){
            ans=true;
        }
        System.out.println(ans);
    }
}