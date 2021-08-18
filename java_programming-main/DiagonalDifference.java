import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=a;
      int c=0,d=0,e;
      int arr[][]=new int[a][b];
      for(int i=0;i<a;i++){
          for(int j=0;j<b;j++){
              arr[i][j]=sc.nextInt();
          }
      }
      for(int i=0;i<a;i++){
          for(int j=0;j<b;j++){
              if(i==j){
                  c+=arr[i][j];
              }
          }
      }
       for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) == (a - 1)) {
                    d+=arr[i][j];
                }
          }
      }
      e=c-d;
      if(e<0){
          e=e*(-1);
      }
      System.out.println(e);
      
    }
}
