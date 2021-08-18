import java.util.Scanner;

public class ArrayInsertion {
    public static void insertion(int arr[],int n,int pos,int insert){
        for(int i=n;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=insert;
        n++;
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
        int insert=sc.nextInt();
        insertion(arr, n, pos, insert);
        sc.close();
    }
}
