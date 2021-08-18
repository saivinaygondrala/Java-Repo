import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[],int start,int end,int search){
        if(end>=start){
            int mid=start+(end-start)/2;
            if(arr[mid]==search)
            return mid;
            else if(arr[mid]>search)
            return binarySearch(arr, start, mid-1, search);
            else 
            return binarySearch(arr, mid+1, end, search);
        }else return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        int a=binarySearch(arr, 0, n-1, search);
        if(a<0){
            System.out.println(search+" not found");
        }
        else{
            System.out.println(search+" is found at "+a);
        }
        sc.close();
    }
    
}
