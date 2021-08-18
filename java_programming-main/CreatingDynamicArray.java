public class CreatingDynamicArray {
      public static void main(String[] args) {
            Array numbers = new Array(3);
            numbers.insert(10);
            numbers.insert(30);
            numbers.insert(40);
            numbers.insert(50);
            numbers.printArray();
            numbers.removeAt(0);
            numbers.printArray();
            int ar=numbers.indexOf(30);
            if(ar<0)System.out.println("Not found");
            else
                  System.out.println("Found at "+ar);
      }
}
class Array{
      private int arr[];
      private int count;
      public Array(int length){
            arr=new int[length];
      }
      public void printArray(){
            for(int i=0;i<count;i++){
                  System.out.print(arr[i]+" ");
            }
            System.out.println();
      }
      public void insert(int element){
            if(arr.length==count){
                  int newArr[]=new int[2*count];
                  for(int i=0;i<count;i++){
                        newArr[i]=arr[i];
                  }
                  arr=newArr;
            }
            arr[count++]=element;
      }
      public void removeAt(int index){
            if(index<0 || index >= count){
                  throw new IllegalArgumentException();
            }
            for(int i=index;i<count;i++){
                  arr[i]=arr[i+1];
            }
            count--;
      }
      public int indexOf(int item){
            for(int i=0;i<count;i++){
                  if(arr[i]==item){
                        return i;
                  }
            }
            return -1;
      }
      
}
