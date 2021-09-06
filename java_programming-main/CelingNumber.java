package javaCodes;

public class CelingNumber {
    public static int ceil(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return arr[start];
        }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,8,10,11};
        System.out.println(ceil(arr, 6));
    }
}
