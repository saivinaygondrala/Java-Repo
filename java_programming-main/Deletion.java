import java.util.Scanner;

public class Deletion{
    public static void deletion(int arr[],int pos,int n){
        for(int i=pos;i<n;i++){
            arr[i]=arr[i+1];
        }
        n--;
        System.out.println("After deleting element : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        deletion(arr, pos,n);
        sc.close();
    }
}