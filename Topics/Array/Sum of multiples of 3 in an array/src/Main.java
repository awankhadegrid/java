import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner instance to read input
        Scanner scanner = new Scanner(System.in);

        // read the number of elements
        int n = scanner.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                sum=sum+arr[i];
            }

        }
        System.out.println(sum);
        scanner.close();
    }
}