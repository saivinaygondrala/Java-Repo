class program20{
  public static void main(String[] args){
    program20 p = new program20();
    p.finalize();
    p = null;
// Requesting JVM to call Garbage Collector method 
    System.gc();
    System.out.println("main completes");
  }
public void finalize()
{
  System.out.println("finalize method overridden");
}
}
