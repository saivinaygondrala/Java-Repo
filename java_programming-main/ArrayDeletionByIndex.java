import java.util.Scanner;
public class ArrayDeletionByIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        for(int i=pos;i<n;i++){
            arr[i]=arr[i+1];
        }
        n--;
        System.out.println("After deleting the element : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
