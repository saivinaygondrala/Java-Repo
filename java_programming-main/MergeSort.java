import java.util.Scanner;
public class MergeSort{
public static void mergeSort(int arr[],int n){
if(n<2) return;
int mid=n/2;
int left[]=new int[mid];
int right[]=new int[n-mid];
for(int i=0;i<mid;i++){
left[i]=arr[i];
}
for(int j=mid;j<n;j++){
right[j-mid]=arr[j];
}
mergeSort(left,mid);
mergeSort(right,n-mid);
merge(arr,left,right,mid,n-mid);
}
public static void merge(int arr[],int left[],int right[],int left_size,int right_size){
int i=0,j=0,k=0;
while(i<left_size && j<right_size){
if(left[i]<=right[j]){
arr[k++]=left[i++];
}
else{
arr[k++]=right[j++];
}
}
while(i<left_size){
arr[k++]=left[i++];
}
while(j<right_size){
arr[k++]=right[j++];
}
}
public static void printArray(int arr[],int n){
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
mergeSort(arr,n);
printArray(arr,n);
}
}