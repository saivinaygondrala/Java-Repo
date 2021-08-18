public class DivideByZeroException {
      //divide by 0 exception
      public static void main(String[] args) {  
            try{
                  int a=0;
                  int b=120;
                  int c=b/a;
                  System.out.println(c);
            }catch(Exception ex){
                  System.out.println("Arithematic exception");
            }finally{
                  System.out.println("Catched Exception");
            }
            sc.close();

      }
}
