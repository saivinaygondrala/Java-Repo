package javaCodes;

public class FindTotalNoOs1s {
	public int findTotalNoOf0s(int arr[]) {
		int index=binarySearch(arr, 0, arr.length-1, 1);
		return arr.length-index+1;
	}
	public int binarySearch(int arr[],int l,int r,int x) {
		if (r >= l) {
            int mid = l + (r - l) / 2;
  
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
  
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
  
        // We reach here when element is not present
        // in array
        return -1;
	}
	public static void main(String[] args) {
		FindTotalNoOs1s one=new FindTotalNoOs1s();
		int arr[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(one.findTotalNoOf0s(arr));

	}

}
