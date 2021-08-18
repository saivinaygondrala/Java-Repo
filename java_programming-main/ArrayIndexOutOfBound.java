public class ArrayIndexOutOfBound {
      public static void main(String[] args) {
            try{
                  int arr[]={1,2,3,4,5,6,7,8,9};
                  System.out.println(arr[10]);
            }catch(ArrayIndexOutOfBoundsException ex){
                  System.out.println("ArrayIndexOutOfBound exception has thrown");
            }
      }
}
