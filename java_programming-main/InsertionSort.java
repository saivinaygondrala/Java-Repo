//Insertion sort is better for less no of elements
//first of all this algo is to make to different list as sorted and unsorted
//it will remove unsorted elements from unsorted list and inserting into sorted sub list //first we will take element which is at index and compare to previous indexed element
//if the previous element is greater than this element then we will store this element in temp and we will insert the previous element into this position and then we will assign the temp to that previous location
public class InsertionSort{
public static void insertionSort(int arr[],int n){
for(int i=1;i<n;i++){
int temp=arr[i];
int j=i-1;
//as we should compare with the previous element
while(j>=0 && arr[j]>temp){
arr[j+1]=arr[j];
j--;
}
arr[j+1]=temp;
}
for(int n1 : arr){
System.out.print(n1+" ");
}
}
public static void main(String[] args){
int arr[]={90,80,70,60,50,40,30,20,10};
insertionSort(arr,arr.length);
}
}
/*
Time complexity : 
best case : O(N)
average case : O(N^2)
worst case : O(N^2)
Spac complexity : O(1)
*/