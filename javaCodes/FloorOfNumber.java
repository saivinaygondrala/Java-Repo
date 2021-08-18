package javaCodes;
//Application of Binary Search
public class FloorOfNumber {
    public static int floorOfNumber(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        //Floor is the greatest number smaller than or equal to target.....
        int arr[]={1,2,4,5,7,8,11};
        System.out.println(floorOfNumber(arr, 6));
    }
}
