import java.util.Scanner;
public class LeapYearChecker{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%4==0) 
      System.out.println(n+" is a leap year");
    else System.out.println(n+" is not a leap year");
  }
}