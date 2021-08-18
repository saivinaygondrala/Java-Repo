package javaCodes;

public class BinarySearch{
	public static int binarySearch(int arr[],int key){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==key){
				return mid;
			}
			if(arr[mid]>key){
				high=mid-1;
			}
			if(arr[mid]<key){
				low=mid+1;
			}

		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(binarySearch(arr, 6));
	}
}