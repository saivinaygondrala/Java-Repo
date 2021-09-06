//https://www.online-java.com/LtSdKBnmTE
public class Arrays {
    private int[] arr;
    private int counter=0;
    public Arrays(int length){
        arr=new int[length];
    }
    public void print(){
        for(int i=0;i<counter;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insert(int item){
        if(counter==arr.length){
            int newArr[]=new int[2*arr.length];
            for(int i=0;i<counter;i++){
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        arr[counter++]=item;
    }
    public void remove(int index){
        if(index<0 || index>=counter){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            for(int i=index;i<counter;i++){
                arr[i]=arr[i+1];
            }
            counter--;
        }
    }
    public void insertAt(int index,int item){
        if(index<0 || index>counter){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i=counter;i>index;i--){
            arr[i]=arr[i-1];
        }
        counter++;
        arr[index]=item;
    }
    public int indexOf(int number){
        for(int i=0;i<counter;i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }
    public int size(){
        return counter;
    }
    public void clear(){
        counter=0;
    }
    public int get(int index){
        return arr[index];
    }
    public void set(int index,int data){
        arr[index]=data;
    }
    public String toString(){
        String str="[";
        for(int i=0;i<counter-1;i++){
            str+=arr[i];
            str+=",";
        }
        str+=arr[counter-1];
        str+="]";
        return str;
    }
}
