class Array{
  public static void main(String[] cars){
  int i1 = 0;
  String[] car = {"volvo","BMW","FORD","LANDROVER","ROLCE ROYCE"};
  car[1] = "FERRARI";
  System.out.println("length of array is "+car.length);
  for(String i : car){
    System.out.println(i1+" = "+i);
    i1++;
}
}
}
