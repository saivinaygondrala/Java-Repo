package javaCodes;

import java.util.Arrays;

public class ArrayReversing{
    static int[] reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17};
        int array[]=reverse(arr);
        System.out.println(Arrays.toString(array));
    }
}