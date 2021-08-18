import java.util.Scanner;

public class MatrixMultiplication {
    public static void matrixMultiplication(int arr[][],int arr1[][]){
        int k=0;
        int sum[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(k=0;k<arr.length;k++){
                    sum[i][j]+=arr[i][k]*arr1[k][j];
                }
            }
        }printArray(sum);
    }
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int arr1[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        matrixMultiplication(arr, arr1);
        
    }
}
