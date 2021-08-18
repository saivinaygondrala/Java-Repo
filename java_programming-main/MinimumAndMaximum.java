import java.util.Scanner;
public class MinimumAndMaximum {
    public static void MinMax(int arr[]){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("Minimum most value of the array is : "+min);
        System.out.println("Maximum most value of the array is : "+max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MinMax(arr);
    }
    
}
