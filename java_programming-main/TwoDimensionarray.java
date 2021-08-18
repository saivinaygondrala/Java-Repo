class TwoDimensionarray{
  public static void main(String[] args){
    int[][] num = {{1,2,3,4},{5,6,7,8}};
    for(int i=0;i<8;i++){
      for(int j=0;j<8;j++){
        System.out.print(" * ");
      }
  }
  for(int i=0;i<8;i++){
    for(int j=0;j<8;j++){
       System.out.print(num[i][j]);
  }
  System.out.println();
  }
 }
}
