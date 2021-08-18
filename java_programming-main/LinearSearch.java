import java.util.*;
public class LinearSearch {
    public static void linearSearch(int arr[],int search){
        int i,flag=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==search){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element found at "+i);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        linearSearch(arr,search);
        sc.close();
    }
    
}
