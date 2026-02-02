import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();

        int arr[][]=new int[i][j];
        for(int k=0;k<i;k++){
            for(int l=0;l<j;l++){
                arr[k][l]=sc.nextInt();
            }
        }

        int n= sc.nextInt();
        int m=sc.nextInt();

        for(int a=0;a<i;a++){
           int temp=arr[a][n];
           arr[a][n]=arr[a][m];
           arr[a][m]=temp;

        }
        for(int a=0;a<i;a++){
            for(int b=0;b<j;b++){
                System.out.print(arr[a][b]+" ");

            }
            System.out.println();
        }
    }
}