import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)) System.out.println(str+" is a Palindrome");
        else System.out.println(str+" is not a palindrome");
        sc.close();
    }
    
}
