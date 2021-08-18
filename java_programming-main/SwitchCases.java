import java.util.Scanner;
public class SwitchCases{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 to add two numbers");
        System.out.println("Enter 2 to sub two numbers");
        System.out.println("Enter 3 to mul two numbers");
        System.out.println("Enter 4 to div two numbers");
        System.out.println("Enter 5 to exit"+"\nyou will be terminated if you click 5");
            int n=sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter the two numbers : ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("The addition of "+a+" and "+b+" is "+(a+b));
                    break;
                case 2:
                    System.out.println("Enter the two numbers : ");
                    int c=sc.nextInt();
                    int d=sc.nextInt();
                    System.out.println("The substraction of "+c+" and "+d+" is "+(c-d));
                    break;
                case 3:
                    System.out.println("Enter the two numbers : ");
                    int e=sc.nextInt();
                    int f=sc.nextInt();
                    System.out.println("The multiplication of "+e+" and "+f+" is "+(e*f));
                    break;
                case 4:
                System.out.println("Enter the two numbers : ");
                int g=sc.nextInt();
                int h=sc.nextInt();
                    System.out.println("The division of "+h+" and "+g+" is "+(h/g));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Not valid input");
            }
        }

    }
}