class B
{
  public int mul(int ...i){
    int mul = 1;
    for(int k : i){//enchanced for loop
      mul = mul*k;
    }
  return mul;
  }
}
class UsingofVarargs{
  public static void main(String[] args){
    B c = new B();
    int s = c.mul(1,2,3,4,5,6,7,8,9,10);//you can give as many of inputs but must be a int 
    System.out.println(s);
  }
}
