package javaCodes;
import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(Exception ex) {
			System.out.println(ex);
		}finally {
			sc.close();
		}
	}

}
