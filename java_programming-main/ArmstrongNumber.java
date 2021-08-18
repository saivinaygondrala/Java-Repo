import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,res=0,r=n;
        while(r>0){
            temp=r%10;
            res=res+temp*temp*temp;
            r/=10;
        }
        if(n==res){
            System.out.println(n+" is a Armstrong number");
        }else{
            System.out.println(n+" is not a Armstrong number");
        }
        //System.out.println(res);
        sc.close();
    }
    
}
